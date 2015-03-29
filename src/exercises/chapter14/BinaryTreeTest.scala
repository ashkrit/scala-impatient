package exercises.chapter14


object BinaryTreeTest extends App {

  val n1 = new Node(new Leaf(3), new Leaf(8))
  val n2 = new Node(n1, new Leaf(2))
  val n3 = new Node(n2, new Leaf(5))

  def sumLeaf(node: BinaryTree): Int = {
    node match {
      case Leaf(value) => value
      case Node(left, right) => sumLeaf(left) + sumLeaf(right)
    }
  }

  println(sumLeaf(n3))


}

sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree