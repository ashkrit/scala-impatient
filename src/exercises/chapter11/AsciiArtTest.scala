package exercises.chapter11

import scala.collection.mutable.ArrayBuffer


object AsciiArtTest extends App {

  val art1 = new AsciiArt
  art1 + " /\\_/\\"
  art1 + "( ' ' )"
  art1 + " ( - ) "
  art1 + " | | | "
  art1 + "(__|__)"

  println(art1)

  val art2 = new AsciiArt
  art2 + "  -----"
  art2 + "/ Hello \\"
  art2 + "< Scala |"
  art2 + "\\ Coder /"
  art2 + "  -----"
  println(art2)


  val merge = art1 horizontal art2

  println(merge)

  val merge2 = art1 verticle art2
  println(merge2)
}

class AsciiArt {

  val artValues = new ArrayBuffer[String]

  def +(text:String) : AsciiArt = {
    artValues += text
    this
  }

  def horizontal (text:AsciiArt) : AsciiArt = {
    val merge  = new AsciiArt

    for((v1,v2) <- artValues.zip(text.artValues) ) {
      merge + (v1+v2)
    }
    merge
  }

  def verticle (text:AsciiArt) : AsciiArt = {
    val merge  = new AsciiArt
    this.artValues.foreach(merge + _)
    text.artValues.foreach(merge + _)

    merge
  }


  override def toString = artValues.mkString("\n")
}
