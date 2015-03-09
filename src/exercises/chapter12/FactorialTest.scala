package exercises.chapter12


object FactorialTest extends App {


  def fact(x:Int):Int = {
    (1 to x).reduceLeft(_ * _)
    //(1 to x).product //recommened by intellij
  }

  def factx(x:Int):Int = {
    (1 to x).foldLeft(1)(_ * _)
    //(1 to x).product //recommened by intellij
  }

  println(fact(5))
  println(factx(-5))
  println(factx(5))



}
