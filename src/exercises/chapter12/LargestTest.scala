package exercises.chapter12


object LargestTest extends App {

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.map(fun).reduceLeft(_ max _)
  }

  def largestAt(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.map { value => (fun(value), value)}.reduceLeft(max2)._2
  }

  def max2(v1: (Int, Int), v2: (Int, Int)): (Int, Int) = {

    val (value1, _) = v1
    val (value2, _) = v2

    if (value1 > value2) v1
    else v2

  }

  println(largest(x => 10 * x - x * x, 1 to 10))
  println(largestAt(x => 10 * x - x * x, 1 to 10))
}
