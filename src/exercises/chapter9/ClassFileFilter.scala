package exercises.chapter9

import java.nio.file._


object ClassFileFilter extends App {


  def fileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path] {
    override def visitFile(p: Path, attrs: attribute.BasicFileAttributes) = {
      f(p)
      FileVisitResult.CONTINUE
    }
  }

  var count = 0
  Files.walkFileTree(Paths.get("C:\\Temp"), fileVisitor((f: Path) => if (f.toFile.getName.endsWith(".java")) {
    count += 1
  }))

  println("File count " + count)

}
