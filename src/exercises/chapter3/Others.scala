package exercises.chapter3

import java.util.TimeZone


object Others {

  def avg(values: Array[Double]): Double = {
    values.sum / values.length
  }

  def descElement(values: Array[Double]): Array[Double] = {
    values.sorted.reverse
  }


  def timeZoneFilter(): Array[String] = {

    for (timezone <- TimeZone.getAvailableIDs) yield {
      timezone match {
        case name if name.startsWith("America/") => name.replace("America/", "")
        case name if !name.startsWith("America/") => name
      }
    }
  }

  def main(args: Array[String]) {

    val numbers = Array(1d, 2, 3, 4, 5, 6)
    println("Avg:" + avg(numbers))

    println("Reverse:" + descElement(numbers).mkString(","))


    val duplicateValues = Array(1, 3, 4, 4, 5, 1)

    println(duplicateValues.distinct.mkString(","))

    println(timeZoneFilter().mkString("\n"))
  }
}
