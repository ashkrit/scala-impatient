package exercises.chapter3

import scala.util.Random


object RandomValues {

  def randomValues(num : Int) : Array[Int] = {
    (for(n <- 0 until num ) yield Random.nextInt(num)).toArray

  }
  def main(args: Array[String]) {

    println(randomValues(10).mkString(","))
  }
}
