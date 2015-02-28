package exercises.chapter4


object MinMaxValues {

  def minMax(values: Array[Int]): (Int, Int) = {
    (values.max, values.min)
  }

  def main(args: Array[String]) {
    val numbers = Array(10, 15, 9, 1, 99)

    println(minMax(numbers))
  }
}
