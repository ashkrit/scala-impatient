package exercises.chapter9


object Pow2Test extends App {
  for (i <- 1 to 20) {
    val (p, r) = (Math.pow(2, i).toString, Math.pow(2, -i).toString)
    println(p.padTo(15, " ").mkString("") + r)

  }
}
