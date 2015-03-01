package exercises.chapter5


object BankAccountTest {

  def main(args: Array[String]) {
    val account = new BankAccount
    account.deposit(10)

    println(account.balance)
  }
}

class BankAccount {

  private var _balance = 0d

  def balance = _balance

  def deposit(amount: Int): Unit = {
    _balance +=  amount
  }

  def widthdraw(amount: Int): Unit = _balance -= amount

}
