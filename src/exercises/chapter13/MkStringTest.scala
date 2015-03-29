package exercises.chapter13


object MkStringTest extends App {

  val names = List("Ashkrit", "Sharma", "Anirav", "Sharma")

  def mkString(values: List[String], sp: String): String = {
    val withSB = values.zipWithIndex.foldLeft(new StringBuilder) _

    val concatValues = withSB { (allValues, value) =>
      value match {
        case (item, index) =>
          if (index > 0) allValues.append(sp)
          allValues.append(value._1)
      }
    }

    concatValues.toString()
  }

  println(mkString(names, ","))
}
