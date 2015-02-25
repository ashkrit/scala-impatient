package exercises.chapter2


object ProductCalculator {


  def productR(i: Long, pow: Int): Long = {
    def calc(p: Int): Long = p match {
      case 0 => 1
      case 1 => i
      case n => i * calc(n - 1)
    }

    val x = pow match {
      case 1 => 1
      case 0 => 0
      case n if n < 0 => -n
      case n if n % 2 == 1 => n
      case n if n % 2 == 0 => n / 2
    }

    pow match {
      case value if value >= 0 => calc(x)
      case value if value < 0 => 1 / calc(x)
    }

  }

  def main(args: Array[String]) {

    println(productR(2, 2))
    println(productR(3, 3))
    println(productR(10, 9))
    println(productR(2, -1))
    println(productR(5, 0))

  }
}
