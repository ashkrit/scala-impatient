package exercises.chapter2


object CountDown {

  def countDown(n: Int): Unit = {
    println("Countdown from " + n)
    for (v <- n to 0 by -1) println(v)
  }

  def main(args: Array[String]) {
    countDown(10)
  }
}
