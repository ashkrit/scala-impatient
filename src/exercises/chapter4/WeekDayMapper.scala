package exercises.chapter4

import java.util.Calendar

import scala.collection.mutable


object WeekDayMapper {

  def main(args: Array[String]) {
    val weekdays = mutable.LinkedHashMap("Monday" -> java.util.Calendar.MONDAY, "Tuesday" -> Calendar.TUESDAY,
      "Wednesday" -> Calendar.WEDNESDAY, "Thursday" -> Calendar.THURSDAY, "Friday" -> Calendar.FRIDAY, "Saturday" -> Calendar.SATURDAY,
      "Sunday" -> Calendar.SUNDAY)

    weekdays.foreach {case (name,t) => println(name +"->" + t)}


  }
}
