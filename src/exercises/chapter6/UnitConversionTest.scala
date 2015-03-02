package exercises.chapter6


object UnitConversionTest extends App {

  def inchesToCentimeters(value:Double) = new UnitConverter(2.54d).convert(value)
  def gallonsToLiters(value:Double) = new UnitConverter(3.7854d).convert(value)
  def milesToKilometers(value:Double) = new UnitConverter(1.6d).convert(value)

  println(inchesToCentimeters(10))
  println(gallonsToLiters(10))

}

abstract class UnitConversion {
  def convert(value: Double): Double
}

class UnitConverter(unitRate: Double) extends UnitConversion {
  override def convert(value: Double): Double = value * unitRate
}


