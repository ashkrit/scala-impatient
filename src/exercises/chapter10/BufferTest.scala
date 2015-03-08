package exercises.chapter10

import java.io.{BufferedInputStream, FileInputStream, InputStream}

import scala.annotation.tailrec


object BufferTest extends App {

  val in = new FileInputStream("c://temp/wordcount.txt") with MoreBufferedReader


  read(in, (v: Char) => print(v))
  val in2 = new FileInputStream("c://temp/wordcount.txt") with JavaBufferReader
  read(in2, (v: Char) => print(v))

  def read(in: InputStream, block: (Char) => Unit): Unit = {

    @tailrec
    def readChar(ch: Int): Unit = ch match {
      case x if x > -1 =>
        block(ch.toChar)
        readChar(in.read())

      case x if x < 0 => None
    }
    readChar(in.read())
  }
}


trait MoreBufferedReader {

  self: InputStream =>

  private val buffer: Array[Byte] = new Array[Byte](10)
  private var index = 0
  private var bytesRead = 0

  override def read(): Int = {

    if (index >= bytesRead) {
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

trait JavaBufferReader {
  self: InputStream =>
  val bis = new BufferedInputStream(this)

  override def read(): Int = {
    bis.read()
  }
}
