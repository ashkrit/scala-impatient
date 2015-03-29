package exercises.chapter13


object ZippingTest extends App {

  val prices = List(100, 20, 40)
  val quantity = List(1, 5, 6)

  val priceWithQty = prices zip quantity

  println("zip =" + priceWithQty)

  val totalPrice = priceWithQty.map { case (p, q) => p * q}

  (prices, quantity).zipped.map((z, y) => println(z))

  println("x" + (prices, quantity).zipped.mkString(","))
  println(totalPrice)


}
