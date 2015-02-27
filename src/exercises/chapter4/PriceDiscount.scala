package exercises.chapter4


object PriceDiscount {

  def main(args: Array[String]) {

    val prices = Map("iPhone5" -> 400, "iPhone5s" -> 500, "iPhone6" -> 800, "iPhone6 Plus" -> 1000)
    val discountedPrices = prices.map {
      case (key, value) => (key -> (value * 0.9))
    }.toMap

    println("Price" + prices)
    println("Discount Price " + discountedPrices)
  }
}
