package exercises.chapter8


object SquareTest extends App {

  println(new Sqaure())
  println(new Sqaure(200))
  println(new Sqaure(0,10,200))
}

class Sqaure(x: Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width, width) {
  def this(width: Int) = this(0, 0, width)

  def this() = this(0, 0, 0)

  override def toString() = Array(x,y,width,width).mkString(",")
}
