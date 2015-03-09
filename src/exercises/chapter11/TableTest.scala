package exercises.chapter11


import scala.collection.mutable.ArrayBuffer


object TableTest extends App {

  val table = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  println(table)

}


class Table {

  val values: ArrayBuffer[Table] = new ArrayBuffer[Table]()

  def |(value: String): Table = {
    if (values.isEmpty) {
      addRowStart
    }
    values += new TD(value)
    this
  }

  def ||(value: String): Table = {
    addRowEnd
    addRowStart
    |(value)
    this
  }

  def addRowStart() = values += new TRStart
  def addRowEnd()  = values += new TREnd


  override def toString = {
    val sb = new StringBuilder()

    val appendedValues = for (item <- values) yield {
      item match {
        case TRStart() => "<tr>"
        case TREnd() => "</tr>"
        case TD(v) => "<td>" + v + "</td>"
      }
    }
    sb.append("<table>")
    sb.append(appendedValues.mkString(""))
    sb.append("</tr>")
    sb.append("</table>")
    sb.toString()
  }
}

object Table {
  def apply() = new Table()
}

case class TD(value: String) extends Table
case class TRStart extends Table
case class TREnd extends Table


