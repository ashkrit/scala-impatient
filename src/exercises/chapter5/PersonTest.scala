package exercises.chapter5


object PersonTest {

  def main(args: Array[String]) {

    val person = new Person("ashkrit", -10)
    println(person.age)

    val name = new Person2("Ashkrit Sharma")
    println(name.firstName + " " + name.lastName)
  }
}

class Person(val name: String, _age: Int) {

  val age = if (_age < 0) 0 else _age
}

class Person2(_name: String) {

  val firstName = _name.split("\\s")(0)
  val lastName = _name.split("\\s")(1)


}
