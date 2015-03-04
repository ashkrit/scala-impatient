package exercises.chapter9

import java.io.File

import scala.io.Source


object FileReverseTest extends App {

  var lines = Source.fromFile(new File("c:/temp/wordcount.txt")).getLines().toVector.reverse

  println(lines.mkString("\n"))

}
