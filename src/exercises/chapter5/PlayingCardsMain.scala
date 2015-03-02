package exercises.chapter5


object PlayingCardsMain extends App {

  for(card <- PlayingCard.values) {
    println(card)
  }
}

object PlayingCard extends Enumeration {

  val Clover = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")
}
