package samples

import scala.io.Source
import scala.sys.process._


object Chapter9 extends App {

  val source = Source.fromFile("c://temp/wordcount.txt", "UTF-8")
  val iter = source.buffered
  while (iter.hasNext) {
    print(iter.next)
  }
  source.close()

  import java.nio.file._
  implicit def makeFileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path] {
    override def visitFile(p: Path, attrs: attribute.BasicFileAttributes) = {
      f(p)
      FileVisitResult.CONTINUE
    }
  }

  //Files.walkFileTree(new File("c:/temp").toPath, (f: Path) => println(f))

  "ls -ltr"!

}

