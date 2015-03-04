package samples


object Chapter10 extends App {

  val savingAccount = new SavingsAccount
  savingAccount.withdraw(10)

  val accountWithLog = new SavingsAccount with ConsoleLogger
  accountWithLog.withdraw(100)

  val acct1 = new SavingsAccount with ConsoleLogger with TimestampLogger with ShortLogger
  acct1.withdraw(99)

  val acct2 = new SavingsAccount with ConsoleLogger with
    ShortLogger with TimestampLogger
  acct2.withdraw(99)

  val data = new {
    val name="Ashkrit"
    val surname="sharma"
  }

  println(data.name)
}

trait Logged {
  def log(msg: String) {}
}

trait ConsoleLogger extends Logged {
  override def log(msg: String) {
    println("Console")
    println(msg)
  }
}

trait TimestampLogger extends Logged {
  override def log(msg: String) {
    println("Time")
    super.log(new java.util.Date() + " " + msg)
  }
}

trait ShortLogger extends Logged {
  val maxLength = 15

  // See Section 10.8 on fields in traits
  override def log(msg: String) {
    println("Short")
    super.log(if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "...")
  }
}

class SavingsAccount extends ConsoleLogger with ShortLogger {

  val interest=10
  def withdraw(amount: Double) {
    log("Withdraw " + amount)
  }
}