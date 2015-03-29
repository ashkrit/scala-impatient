package exercises.chapter14


object SumOptionalValuesTest extends App {

  val numbers = List(Some(1), Some(2), None, Some(4))
  println(numbers.flatMap(v => v).sum)
}
