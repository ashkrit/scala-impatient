package exercises.chapter3


object PosNegValues {

  def posNegValues(numbers:Array[Int]) : Array[Int] = {

    val pos = for(n <- numbers if n > 0) yield n
    val neg = for(n <- numbers if n < 0) yield n

    Array.concat(pos,neg)
  }

  def posNegValues2(numbers:Array[Int]) : Array[Int] = {

    val pos = numbers.filter(_>0).toList.toArray
    val neg = numbers.filter(_<0).toList.toArray

    Array.concat(pos,neg)
  }

  def main(args: Array[String]) {

    val numbers = Array(10,-2,15,-7,19,48)
    println(posNegValues(numbers).mkString(","))
    println(posNegValues2(numbers).mkString(","))
  }
}
