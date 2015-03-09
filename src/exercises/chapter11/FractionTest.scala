package exercises.chapter11


object FractionTest extends App {

  val f1 = new Fraction(1,2)

  println(f1)

  println(new Fraction(1,3) + new Fraction(1,4))
  println(new Fraction(1,3) - new Fraction(1,4))
  println(new Fraction(1,2) * new Fraction(2,5))
  println(new Fraction(1,2) / new Fraction(1,6))
}

class Fraction(n: Int, d: Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  override def toString = num + "/" + den

  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

  def gcd(a: Int, b: Int): Int = if (b == 0) Math.abs(a) else gcd(b, a % b)

  def +(that :Fraction):Fraction = {
    new Fraction(num * that.den  + that.num * den, den*that.den)
  }

  def -(that :Fraction):Fraction = {
    new Fraction(num * that.den  - that.num * den, den*that.den)
  }

  def *(that :Fraction):Fraction = {
    new Fraction(num * that.num, den*that.den)
  }

  def /(that :Fraction):Fraction = {
    this * new Fraction(that.den,that.num) // invert den/num and call *
  }
}
