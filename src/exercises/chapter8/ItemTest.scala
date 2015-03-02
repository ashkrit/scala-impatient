package exercises.chapter8


object ItemTest extends App {

  val item = new SimpleItem(10, "IPhone")
  println(item.desc)

  val items: Array[Item] = Array(new SimpleItem(10, "IPhone"), new SimpleItem(20, "S5"))

  val bundle = new Bundle2
  bundle.addItems(new SimpleItem(10, "IPhone"))

  println(bundle.price)
}

abstract class Item {
  def price: Double

  def desc: String
}

class SimpleItem(val price: Double, val desc: String) extends Item {
}

class Bundle(items: Array[Item]) extends {
  val totalPrice = {
    items.map(_.price).sum
  }
}
with SimpleItem(totalPrice, "Bundel")


class Bundle2 extends Item {
  var items: List[Item] = List()

  def addItems(item: Item): Unit = {
    items = items :+ item
  }

  override def price: Double = items.map(_.price).sum

  override def desc: String = "Bundle"
}