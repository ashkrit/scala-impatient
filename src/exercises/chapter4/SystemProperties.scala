package exercises.chapter4

import scala.collection.convert.WrapAsScala


object SystemProperties {


  def main(args: Array[String]) {
    val prop = WrapAsScala.dictionaryAsScalaMap(System.getProperties)
    val maxLen = prop.map { case (k, _) => k.toString.length}.max

    prop.foreach { case (name, value) => println(name.toString.padTo(maxLen, " ").mkString + " | " + value)}
  }

}
