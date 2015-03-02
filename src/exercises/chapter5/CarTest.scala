package exercises.chapter5


object CarTest {

  def main(args: Array[String]) {
    val car = new Car("Tata", "Nano", 2013)
    println(car)
  }


}

class Car(val manufacturer: String, val model: String, val year: Int = -1, val licencePlate: String = "") {
  override def toString = s"Car($manufacturer $model $year $licencePlate)"
}
