package exercises.chapter10


object RectangleLikeTest extends App {

  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  egg.translate(10, -10)
  egg.grow(10, 20)
}


trait RectangleLike {
  def getX: Double

  def getY: Double

  def getWidth: Double

  def getHeight: Double


  def setFrame(x: Double, y: Double, w: Double, h: Double)

  def translate(dx: Int, dy: Int): Unit = {
    setFrame(getX + dx, getY + dy, getWidth, getHeight)
  }

  def grow(h: Int, v: Int): Unit = {
    setFrame(getX, getY, getWidth + v, getHeight + h)
  }
}




