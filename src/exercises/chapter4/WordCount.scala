package exercises.chapter4

import scala.collection.mutable


object WordCount {

  def wordCount(): Unit = {
    val in = new java.util.Scanner(new java.io.File("c:/temp/wordcount.txt"))

    val wordsCount = mutable.Map[String, Int]() withDefaultValue 0
    while (in.hasNext) {
      val word = in.next()
      val count = wordsCount(word)
      wordsCount += (word -> (count + 1))
    }

    println(wordsCount)

  }

  def wordCountInMutable(): Unit = {
    val in = new java.util.Scanner(new java.io.File("c:/temp/wordcount.txt"))

    var wordsCount = Map[String, Int]() withDefaultValue 0
    while (in.hasNext) {
      val word = in.next()
      val count = wordsCount(word)
      wordsCount += (word -> (count + 1))
    }

    println(wordsCount)

  }

  def main(args: Array[String]) {

    wordCount()
    wordCountInMutable()
  }
}
