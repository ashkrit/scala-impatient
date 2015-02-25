package exercises.chapter2


object SigNum {

  def signum(value: Int): Int = value match {

    case x if x > 0 => 1
    case x if x < 0 => -1
    case _ => 0
  }

  def main(args: Array[String]) {

    println(signum(10))
    println(signum(-10))
    println(signum(0))
  }
}
