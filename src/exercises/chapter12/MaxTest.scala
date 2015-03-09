package exercises.chapter12


object MaxTest extends App {

  val values = Array(1, 10, 9, 6, 4)

  val f = (x: Int, y: Int) => {
    println("Comparing " + x + " and " + y)
    Math.max(x, y)
  }

  println(values.reduceLeft(_ max _))
  println(values.reduceLeft(f))

}
