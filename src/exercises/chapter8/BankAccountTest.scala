package exercises.chapter8


object BankAccountTest extends App {

  val account = new CheckingAccount(100)

  println(account.currentBalance)
  account.deposit(1)
  println(account.currentBalance)


  val savingAccount = new SavingAccount(100, 1)
  println(savingAccount.currentBalance)
  savingAccount.deposit(1)
  savingAccount.deposit(1)
  savingAccount.deposit(1)
  println("Should be 103 = " + savingAccount.currentBalance)
  savingAccount.deposit(1)
  println("Should be 103 only " + savingAccount.currentBalance)

  savingAccount.earnMonthlyInterest(10)
  println("Should be 113 = " + savingAccount.currentBalance)
  savingAccount.deposit(1)
  println("Should be 114 = " + savingAccount.currentBalance)
}

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def currentBalance = balance

  def deposit(amount: Double) = {
    balance += amount;
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount;
    balance
  }
}


class CheckingAccount(initialBalance: Double, chargeAmount: Double = 1.0) extends BankAccount(initialBalance) {

  override def deposit(amount: Double) = {
    super.deposit(amount)
    charge()
  }

  override def withdraw(amount: Double) = {
    super.withdraw(amount)
    charge()
  }

  private def charge(): Double = {
    super.withdraw(chargeAmount)
  }
}

class SavingAccount(initialBalance: Double, chargeAmount: Double = 1.0) extends BankAccount(initialBalance) {

  var transactionCount = 0

  def earnMonthlyInterest(amount: Double): Double = {
    transactionCount = 0
    super.deposit(amount)
  }


  override def deposit(amount: Double) = {
    charge()
    super.deposit(amount)
  }

  override def withdraw(amount: Double) = {
    charge()
    super.withdraw(amount)
  }

  private def charge(): Unit = {
    transactionCount += 1
    if (isChargedTransaction)
      super.withdraw(chargeAmount)

  }


  def isChargedTransaction: Boolean = {
    transactionCount > 3
  }
}
