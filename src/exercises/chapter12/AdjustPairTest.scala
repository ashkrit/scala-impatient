package exercises.chapter12


object AdjustPairTest extends App {


  def plus: (Int, Int) => Int = _ + _

  def product: (Int, Int) => Int = _ * _

  def adjustPairs(fn: (Int, Int) => Int)(pair: (Int, Int)): Int = {
    fn(pair._1, pair._2)
  }

  val plusFn = adjustPairs(plus) _
  val productFn = adjustPairs(product) _


  val pairs = (1 to 10) zip (11 to 20)

  println(pairs.map(plusFn))
  println(pairs.map(productFn))
}
