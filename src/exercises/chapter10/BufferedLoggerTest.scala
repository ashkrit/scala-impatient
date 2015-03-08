package exercises.chapter10

import java.io.{FileInputStream, InputStream}

import scala.annotation.tailrec


object BufferedLoggerTest extends App {

  val in = new FileInputStream("c://temp/wordcount.txt") with Logger2 with DebugBufferedReader

  read(in, (v: Char) => print(v))

  def read(in: InputStream, block: (Char) => Unit): Unit = {

    @tailrec
    def readChar(ch: Int): Unit = ch match {
      case x if x > -1 =>block(ch.toChar)
        readChar(in.read())
      case x if x < 0 => None
    }
    readChar(in.read())
  }

}

trait Logger2 {
  def log(message:String) = println(message)
}

trait DebugBufferedReader {

  self: InputStream with Logger2 =>

  private val buffer: Array[Byte] = new Array[Byte](10)
  private var index = 0
  private var bytesRead = 0

  override def read(): Int = {

    if (index >= bytesRead) {
      log("Fill buffer")
      bytesRead = read(buffer)
      index = 0
    }

    index match {
      case charIndex if charIndex > bytesRead => -1
      case _ =>
        index += 1
        buffer(index - 1)
    }

  }
}


