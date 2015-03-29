package exercises.chapter13

import scala.collection.mutable


object RemoveElementTest extends App {

  val numbers = mutable.LinkedList(0,10,0,14,0,19)
  println(numbers.filterNot(_ == 0))

}
