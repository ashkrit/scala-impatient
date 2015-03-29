package samples


object Chapter14 extends App {

  val numbers = Array(1,10,20,30)

  numbers match {
    case Array(1,x) => println(x)
    case Array(x,y) => println("Multiple" + x + " " + y)
    case _ => println("None")
  }
}
