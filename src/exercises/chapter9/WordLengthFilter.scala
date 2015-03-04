package exercises.chapter9

import java.io.File

import scala.io.Source


object WordLengthFilter extends App {


  //for
  for (line <- Source.fromFile(new File("c:/temp/wordcount.txt")).getLines();
       word <- line.split(" ")
       if (word.length > 3)) {
    println(word)
  }

  println("Using collection")
  //Using collections
  Source.fromFile(new File("c:/temp/wordcount.txt")).getLines().flatMap(_.split(" ")).filter(_.length > 3).foreach(println(_))


}
