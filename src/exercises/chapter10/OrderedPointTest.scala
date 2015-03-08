package exercises.chapter10

import java.awt.Point


object OrderedPointTest extends App {

  val p1 = new OrderedPoint(10, 20)
  val p2 = new OrderedPoint(9, 20)
  val p3 = new OrderedPoint(9, 22)

  println(p1 > p2) // True because X is Gt
  println(p2 > p3)
  // False X is same but y is LT


  val points = Array(p1, p3, p2)

  println(points.sortWith(_.compare(_) > 0).mkString(","))

}


class OrderedPoint(x: Int, y: Int) extends Point(x, y) with math.Ordered[Point] {
  def this() = this(0, 0)

  override def compare(that: Point): Int = {
    getX < that.getX && getY < that.getY match {
      case true => -1
      case false => 1
    }
  }

  override def toString = s"x=$getX  y =$getY"

}
