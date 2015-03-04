package exercises.chapter9

import java.io.File

import scala.io.Source


object FloatTest extends App {

  val pattern = "[0-9]+|(/.)".r

  def numbers = Source.fromFile(new File("c:/temp/numbers.txt")).getLines().filterNot(pattern.findFirstIn(_).isEmpty).map(_.toFloat)
  println(numbers.sum)


}
