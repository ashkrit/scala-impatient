package exercises.chapter10


object TraitExamplesTest extends App {

  val person = new Person() with BarkingDog with CleverCat

  person.hello()

  val person2 = new Person() with FriendlyCat
  person2.hello()

}

trait Animal {
  def hello(): Unit = {}
}

class Person extends Animal {

}

trait BarkingDog extends Animal {
  override def hello(): Unit = println("Bark bark")
}

trait CleverCat extends Animal {
  override def hello(): Unit = {
    println("Mio Mio i want milk")
    super.hello
  }
}

trait FriendlyCat extends Animal {
  override def hello(): Unit = {
    println("I am your friend")
    super.hello
  }
}
