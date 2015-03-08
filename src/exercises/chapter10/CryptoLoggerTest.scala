package exercises.chapter10


object CryptoLoggerTest extends App {

  val acct = new Account with DefaultLogger with CryptoLogger
  acct.withdraw(100)

  val acct2 =  new Account with DefaultLogger with CryptoLogger { override val key= -13}
  acct2.withdraw(100)

  val acct3 =  new  { override val key= -14} with Account with DefaultLogger with CryptoLogger
  acct3.withdraw(100)
}

trait Logger {

  def log(message: String) = {

  }
}

trait DefaultLogger extends Logger {

  override def log(message: String) = {
    println(message)
  }
}

trait CryptoLogger extends Logger {
  def key = 3
  override def log(message: String) = {
    super.log(key + ":" + message)
  }
}

class Account extends Logger {
  def withdraw(amount: Int) = {
    log("widhdraw " + amount)
  }
}
