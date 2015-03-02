package samples


object Chapter8 extends App {


  val emp = new Employee
  val per = emp.asInstanceOf[MorePerson]

  if(emp.isInstanceOf[Employee])
  {
      println("Emp Instance")
  }

  emp match {
    case e:Employee => println("Emp matched")
  }


  def meet(p: Person{def greeting: String}) {
    println(p.name + " says: " + p.greeting)
  }

}

class MorePerson

class Employee extends MorePerson {

  override def toString = "Emp"
}