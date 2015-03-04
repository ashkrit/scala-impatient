package exercises.chapter9

import java.io.File
import java.nio.file.{Files, Paths}

import scala.io.Source


object TabToSpaceTest extends App {

  val lines = Source.fromFile(new File("c:/temp/tabfile.txt")).getLines()
  var outFile = Files.newBufferedWriter(Paths.get("out.txt"))
  var colCount=5
  for(line <-lines) {
      val cols = line.split("\t")
      for((col,index) <- cols.zipWithIndex) {
        outFile.write(col)
        if(index < cols.length-1) // Guard last col
          outFile.write(" " * (colCount-col.length%colCount))
      }
    outFile.newLine()
  }

  outFile.flush()
  outFile.close()

}
