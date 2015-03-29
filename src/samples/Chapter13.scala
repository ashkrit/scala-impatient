package samples

import scala.collection.mutable


object Chapter13 extends App {

  var country = mutable.Map("a"->"s")

  country += ("b"->"c")
  country.mkString

  println(country)

  val v:Vector[String] = Vector()

  v + "d"


  println(v)
}
