package exercises.chapter14


object LeafSumTest extends App {

  def sumLeafs(values: List[Any]): Int = values match {
    case Nil => 0
    case first :: rest =>
      val total = sumTuples(first)
      total + sumLeafs(rest)

  }

  def sumTuples(first: Any): Int = {
    val total = first match {
      case number: Int => number
      case rest: Product => rest.productIterator.toList.map(x => x.toString.toInt).sum
    }
    total
  }

  val leafs = List((3, 8), 2, (5, 2, 3, 4))
  println(sumLeafs(leafs))


}
