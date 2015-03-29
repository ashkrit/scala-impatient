package exercises.chapter14


object ItemTest extends App {

  def price(it: Item): Double = it match {
    case Article(_, p) => p
    case Bundle(_, disc, its@_*) => its.map(price _).sum - disc
    case Multiple(qty, item) => price(item) * qty

  }

  val items = Bundle("Father's day special", 20.0,
    Article("Scala for the Impatient", 39.95),
    Bundle("Anchor Distillery Sampler", 10.0,
      Article("Old Potrero Straight Rye Whiskey", 79.95),
      Article("Junípero Gin", 32.95)))

  val totalPrice = price(items)

  println(totalPrice)



  val multipleItems = Multiple(10, Article("Blackwell Toaster", 30))
  println(price(multipleItems))


  val scalaBooks = Bundle("Top Scala books", 10.0,
    Article("Scala for the impatient", 30),Article("Functional Programming in scala", 50))
  val books = Multiple(2,scalaBooks)
  println(price(books))

}

abstract class Item

case class Article(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, items: Item*) extends Item

case class Multiple(qty: Int, items: Item) extends Item