package exercises.chapter4


object LessThanValues {

  def lteqgt(numbers: Array[Int], key: Int): Map[String, Int] = {

    numbers.groupBy(value => value match {
      case x if x > key => "gt"
      case x if x < key => "lt"
      case _ => "eq"
    }).map { case (k, v) => (k, v.length)}
  }

  def main(args: Array[String]) {

    val numbers = Array(10, 20, 30, 40, 40, 50, 70, 80)

    println(lteqgt(numbers, 40))


  }
}
