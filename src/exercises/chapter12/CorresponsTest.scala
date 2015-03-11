package exercises.chapter12

import scala.collection.GenSeq


object CorresponsTest extends App {



  val a = Array("Hello", "World")
  val b = Array("hello", "world")



  println(a.corresponds(b)(_.equalsIgnoreCase(_)))

  val lengths = Array(5, 5)

  println(a.corresponds(lengths)(_.length == _))


  def corresponds[B,A](curr:GenSeq[A],that: GenSeq[B],p: (A,B) => Boolean): Boolean = {
    val i = curr.iterator
    val j = that.iterator
    while (i.hasNext && j.hasNext)
      if (!p(i.next, j.next))
        return false

    !i.hasNext && !j.hasNext
  }

  println(corresponds(a,lengths,(first:String,second:Int) => first.length == second))
  //Have to pass both parameter & data type can be inferred

}

