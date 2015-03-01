package exercises.chapter5


object CounterTest {

  def main(args: Array[String]) {
    val counter = new Counter

    for (i <- 0 to Integer.MAX_VALUE-1)
      counter.increment()

    counter.increment() // THis wil fail
    println(counter.current())
  }


}


class Counter {
  private var value = 0

  // You must initialize the field
  def increment() {
    if (value == Integer.MAX_VALUE) throw new IllegalArgumentException("Overflow")
    value += 1
  }

  // Methods are public by default
  def current() = value
}