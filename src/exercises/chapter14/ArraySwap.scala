package exercises.chapter14


object ArraySwap extends App {

  def swap(values: Array[Int]): Array[Int] = values match {
    case Array(first) => values
    case Array(first, second, rest@_*) => Array(second, first) ++ rest
  }

  val fournumbers = Array(10, 20, 99, 100)
  println(fournumbers.mkString(",") + "=" + swap(fournumbers).mkString(","))

  val twonumbers = Array(10, 20)
  println(twonumbers.mkString(",") + "=" + swap(twonumbers).mkString(","))

  val singlenumbers = Array(10)
  println(singlenumbers.mkString(",") + "=" + swap(singlenumbers).mkString(","))
}
