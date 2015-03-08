package exercises.chapter10

import java.beans.{PropertyChangeEvent, PropertyChangeListener, PropertyChangeSupport}


object PropertyListenerTest extends App {

  val makePropListener = new PropertyChangeListener() {
    override def propertyChange(evt: PropertyChangeEvent): Unit = {
      println("Property Changed" + evt.getPropertyName + " :" + evt.getNewValue)
    }
  }

  val acc = new BankAccount
  acc.addPropertyChangeListener(makePropListener)
  acc.withdraw(10)

}

trait PropertyChange {

  val selfObject: PropertyChangeSupport

  def addPropertyChangeListener(listener: PropertyChangeListener): Unit = {
    selfObject.addPropertyChangeListener(listener)
  }

  def firePropertyChange(propertyName: String, oldValue: AnyRef, newValue: AnyRef) {
    selfObject.firePropertyChange(propertyName, oldValue, newValue)
  }
}

class BankAccount extends PropertyChange {
  override val selfObject = new PropertyChangeSupport(this)

  def withdraw(amount: Int): Unit = {
    firePropertyChange("withdraw", new Integer(-1), new Integer(amount));
  }
}
