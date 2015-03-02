package samples


class Chapter6 {

}

object Accounts {
  private var lastNumber = 0
  def newUniqueNumber() = { lastNumber += 1; lastNumber }
}

class Accounts {
  val x="Yahoo"
}
