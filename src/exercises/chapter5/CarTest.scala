package exercises.chapter5


object CarTest {

  def main(args: Array[String]) {
    val car = new Car("Tata", "Nano",2013)
    println(car)
  }


}

class Car(_manufacturer: String, _model: String, _year: Int = -1, _licencePlate: String = "") {

  val manufacturer = _manufacturer
  val model = _model
  val year = _year
  var licencePlate = _licencePlate

  override def toString = s"Car($manufacturer $model $year $licencePlate)"
}
