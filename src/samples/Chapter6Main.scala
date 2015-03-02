package samples


object Chapter6Main extends App {

  println("Main" + args.length)
  println(TrafficLightColor.Green)

  for(i <-TrafficLightColor.values) {
    println(i)
  }
}

object TrafficLightColor extends Enumeration {
  val Red = Value
  val Yellow = Value
  val Green = Value
}