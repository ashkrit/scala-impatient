package exercises.chapter11


object MoneyTest extends App {


  val m1 = Money(1, 75)
  val m2 = Money(0, 50)

  println(m1+m2 == Money(2,25))
}

case class Money(dollar:Int,cents:Int) {

  def dollar(amount:Int) = amount/100
  def cents(amount:Int) = amount%100
  def +(that:Money) = {
    val amount = this.cents+that.cents
    new Money(this.dollar+that.dollar + dollar(amount) , cents(amount))
  }
}
