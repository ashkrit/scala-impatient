package exercises.chapter8


object ShapeTest extends App {

  println( new Rectangle(10,20,100,100).centerPoint)
}

abstract class Shape(x: Int, y: Int) {
  def centerPoint: (Double, Double)
}

//Used case because you get toString for free!
case class Rectangle(x: Int,  y: Int, length: Int, width: Int) extends Shape(x, y) {
  override def centerPoint = (x + length / 2, y + width / 2)
}

case class Circle(x: Int, y: Int, radius: Int) extends Shape(x, y) {
  override def centerPoint = (0d, 0d)
}
