package exercises.chapter6


object Conversion extends App {

  println("inc to CM " + inchesToCentimeters(10))
  println("gallon to Litter " + gallonsToLiters(10))
  println("Miles to KM " + milesToKilometers(10))

  def inchesToCentimeters(inch: Int): Double = {
    inch * 2.54
  }

  def gallonsToLiters(gallon: Int): Double = {
    gallon * 3.7854
  }

  def milesToKilometers(miles: Int): Double = {
    miles * 1.6
  }
}
