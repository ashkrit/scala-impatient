package exercises.chapter12


object RangeFunctionTest extends App {

  def values(fun:Int => Int,low:Int,high:Int): List[(Int,Int)] = {
    (for(x <- low to high) yield (x,fun(x))).toList
  }

  println(values(x => x*x,-5 , 5))
}
