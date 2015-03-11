package exercises.chapter12


object UnlessTest extends App {

  def unless(condition: => Boolean)(block: => Unit) = {
    if (!condition) {
      block
    }
  }

  var x = 10

  unless(x > 10) {
    println("x is not > 10")
  }

}
