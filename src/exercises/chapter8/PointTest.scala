package exercises.chapter8


object PointTest extends App {

  val point = new LabeledPoint("Black Thursday",1929,230.07f)



}

class Point(x: Int, y: Float)

class LabeledPoint(name: String, x: Int, y: Float) extends Point(x, y)

