package exercises.chapter13

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


object CharacterMapTest extends App {

  def indexes(word: String) = {
    val withIndex = word.zipWithIndex
    val charOrderMap = Map[Char, Set[Int]]() withDefault (c => Set[Int]())

    val withInitialMap = withIndex.foldLeft(charOrderMap)(_)

    withInitialMap {
      (charMap, charWithIndex) => {
        val (key, index) = charWithIndex
        val appendValue = charMap(key) + index
        charMap + (key -> appendValue)
      }
    }
  }

  def index2(word: String) = {

    val withIndex = word.zipWithIndex
    val charOrderMap = mutable.Map[Char, ArrayBuffer[Int]]() withDefault (c => mutable.ArrayBuffer[Int]())
    for ((ch, index) <- withIndex) {
      val idx = charOrderMap(ch)
      idx += index
      charOrderMap += (ch -> idx)
    }
    charOrderMap
  }

  println(indexes("Mississippi"))
  println(index2("Mississippi"))


  def indexByGroupBy(word: String) = {
    val charIndexPairToIndex: IndexedSeq[(Char, Int)] => IndexedSeq[Int] = (seq) => seq.map(_._2)
    val groupByresult = word.zipWithIndex groupBy {
      _ match {
        case (ch, _) => ch
      }
    }
    groupByresult.map(entry => (entry._1, charIndexPairToIndex(entry._2)))
  }

  println(indexByGroupBy("Mississippi"))

}
