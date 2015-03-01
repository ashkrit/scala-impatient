package exercises.chapter5

import scala.beans.BeanProperty

class Student(@BeanProperty _name: String, @BeanProperty _id: Int) {

  @BeanProperty var name = _name
  @BeanProperty var id = _id
}