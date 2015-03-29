package exercises.chapter14


object SwapTest extends App {

  def swap(value: (Int, Int)): (Int, Int) = {
    value.swap
  }

  def swap2(value: (Int, Int)): (Int, Int) = value match {
    case (x, y) => (y, x)
  }

  println((10, 20))
  println((10, 20))
}
