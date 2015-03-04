package exercises.chapter9

import java.io.File

import scala.io.Source


object NonFloatTest extends App {

  val pattern = "[0-9]+|(/.)".r

  Source.fromFile(new File("c:/temp/numbers.txt")).getLines().filter(pattern.findFirstIn(_).isEmpty).foreach(println(_))


}
