package samples


object Chapter11 extends App {

  val √ = scala.math.sqrt _
  println(√(2))

  val r = 1 to 10

  val o = new MyOp1

  o add new MyOp1
  o + new MyOp1


}

class MyOp1 {

  def add(o:MyOp1) = {
    new MyOp1
  }

  def +(o:MyOp1) = {
    new MyOp1
  }
}
