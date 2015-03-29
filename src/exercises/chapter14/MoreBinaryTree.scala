package exercises.chapter14


object MoreBinaryTree extends App {

  def sumOneLeaf(node: BinaryTree2): Int = {
    node match {
      case Leaf2(value) => value
      //case Node2( all @ _*) => all.map(sumOneLeaf _).sum
      case Node2(f, all@_*) => sumOneLeaf(f) + expandLeaf(all)
    }
  }

  def expandLeaf(node: Seq[BinaryTree2]): Int = {
    node match {
      case Nil => 0
      case Seq(f, r@_*) => sumOneLeaf(f) + expandLeaf(r)
    }
  }

  def sum(node: Node2): Int = {
    node.nodes.map(sumOneLeaf _).sum
  }




  val tree = Node2(Node2(Leaf2(3), Leaf2(8)), Leaf2(2), Node2(Leaf2(5)))

  println(sum(tree))

}

sealed abstract class BinaryTree2

case class Leaf2(value: Int) extends BinaryTree2

case class Node2(nodes: BinaryTree2*) extends BinaryTree2