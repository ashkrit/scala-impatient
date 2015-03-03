package exercises.chapter8


object PersonTest {

}

class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}


//New final field is declared in sub class and getName gets name from subclass
class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  // Don’t want to reveal name . . .
  override val toString = "secret" // . . . or class name
}


class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

//Same as above new final field in subclass
class Ant extends Creature {
  override val range = 2
}