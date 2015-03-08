package exercises.chapter10

import java.io.{FileInputStream, InputStream}


object IterableInputStreamTest extends App {

  val in = new FileInputStream("c://temp/wordcount.txt") with IterableInputStream
  for (b <- in) {
    print(b.toChar)
  }

}


trait IterableInputStream extends Iterable[Byte] {

  self: InputStream =>
  val in = this

  override def iterator: Iterator[Byte] = new Iterator[Byte] {
    var ch: Int = -1

    override def hasNext: Boolean = {
      ch = in.read()
      ch > 0
    }

    override def next(): Byte = ch.toByte
  }
}
