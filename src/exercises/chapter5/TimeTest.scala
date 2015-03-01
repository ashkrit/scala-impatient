package exercises.chapter5


object TimeTest {

  def main(args: Array[String]) {
    val time = new Time(12, 25)

    println(time.before(new Time(12, 20)))

    println(new Time2(12, 25).before(new Time2(12, 20)))
  }

}

case class Time(hourValue: Int, minuteValue: Int) {

  require(hourValue >= 0 && hourValue <= 23, "hour value should be in range from 0 to 23")
  require(minuteValue >= 1 && minuteValue <= 60, "minute value should be in range from 1 to 60")
  val hour = this.hourValue
  val minute = this.minuteValue

  def before(other: Time): Boolean = {

    other match {
      case Time(h, _) if h < hour => true
      case Time(h, _) if h > hour => false
      case Time(_, m) if m < minute => true
      case Time(_, m) if m > minute => false
    }
  }
}

case class Time2(hourValue: Int, minuteValue: Int) {

  require(hourValue >= 0 && hourValue <= 23, "hour value should be in range from 0 to 23")
  require(minuteValue >= 1 && minuteValue <= 60, "minute value should be in range from 1 to 60")
  val hour = this.hourValue
  val minute = this.minuteValue
  val timeTillMidNight = hourValue * 60 + minuteValue

  def before(other: Time2): Boolean = {
    timeTillMidNight > other.timeTillMidNight
  }


}