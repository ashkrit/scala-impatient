package exercises.chapter14


object ComposeTest extends App {

  def f(x: Double) = if (x >= 0) Some(Math.sqrt(x)) else None

  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

  val h: Double => Option[Double] = v => compose(v, g, f)

  def compose(value: Double, f1: Double => Option[Double], f2: Double => Option[Double]) = {
    f1(value).map(f2).flatMap(f => f)
  }

  println(h(2))
  println(h(1))
  println(h(0))
}
