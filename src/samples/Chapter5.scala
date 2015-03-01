package samples

import java.util.Date


object Chapter5 {


}

class Person {
  val age = 0
  val curr = new Date()
  val name="ashkrit"

}

class Counter {
  private var value = 0
  def increment() { value += 1 }
  def isLess(other : Counter) = value < other.value
  // Can access private field of other object
}
