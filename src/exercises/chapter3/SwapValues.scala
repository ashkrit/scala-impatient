package exercises.chapter3


object SwapValues {

  def swapValues(numbers: Array[Int]): Array[Int] = {
    for (index <- 0 until numbers.length by 2) {
      val newIndex = index match {
        case x if x < numbers.length - 1 => x + 1
        case _ => index
      }
      val tmp = numbers(newIndex)
      numbers(newIndex) = numbers(index)
      numbers(index) = tmp
    }
    numbers
  }

  def swapValuesNew(numbers: Array[Int]): Array[Int] = {
    val indexes = for (index <- 0 until numbers.length) yield {
      val newIndex = index match {
        case 0 => 1
        case x if x == numbers.length - 1 => x
        case x if x % 2 == 1 => x - 1
        case x if x % 2 == 0 => x + 1
      }
      newIndex
    }
    (for (index <- indexes) yield numbers(index)).toArray
  }

  def main(args: Array[String]) {

    val numbers = Array(1, 2, 3, 4, 5)
    println(numbers.mkString(","))
    println(swapValuesNew(numbers).mkString(","))
    println(swapValues(numbers).mkString(","))

  }
}
