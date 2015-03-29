package exercises.chapter13


object MapValueToIndex extends App {

  val names = Array("Tom", "Fred", "Harry")
  val namesIndex = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
  val index = names.map(namesIndex.get(_)).flatMap(v => v)

  println(index.mkString(" "))

}
