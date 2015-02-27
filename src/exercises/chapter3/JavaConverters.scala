package exercises.chapter3

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

import scala.collection.convert.WrapAsScala


object JavaConverters {

  def main(args: Array[String]) {

    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val result = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

    val scalaBuffer = WrapAsScala.asScalaBuffer(result)

    println(result.getClass)
    println(scalaBuffer.getClass)

  }
}
