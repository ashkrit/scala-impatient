package exercises.chapter2


object CharProduct {

  def product(s:String): Int ={
    var p=1
    for(ch <- s) p = p * ch
    p
  }

  def productL(s:String): Long ={
    var p=1L
    for(ch <- s) p = p * ch.toLong
    p
  }

  def productS(s:String) : Long = {
    s.map(_.toLong).foldLeft(1L){(a,x) => a * x}
  }

  def productS2(s:String) : Long = {
    s.foldLeft(1L){(a,x) => a * x}
  }

  def productR(s:String) : Long = {
    def r(acc:Long,chs : String) : Long =  {
      chs.isEmpty match {
        case false => r((acc * chs.head.charValue().toLong),chs.tail)
        case true => acc
      }
    }
    r(1,s)
  }

  def main(args: Array[String]) {
      println("Int =" + product("Hello"))
      println("Long=" + productL("Hello"))
      println("StringOps=" + productS("Hello"))
    println("StringOps2=" + productS2("Hello"))
    println("Recur=" + productR("Hello"))
  }
}
