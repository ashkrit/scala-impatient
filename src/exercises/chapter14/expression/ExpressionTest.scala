package exercises.chapter14.expression


object ExpressionTest extends App {

  def eval(tree: BinaryTree): Int = {
    tree match {
      case Leaf(value) => value
      case Node(op, leafs@_*) =>
        applyOp(op, leafs.map(eval _))

    }
  }

  def applyOp(op: String, values: Seq[Int]): Int = op match {
    case "+" => values.sum
    case "*" => values.product
    case "-" => values.foldLeft(0)(_ - _)

  }

  val plus = Node("*", Leaf(10), Leaf(20))
  val ex = Node("+", Node("*", Leaf(3), Leaf(8)), Leaf(2), Node("-", Leaf(5)))
  println(eval(ex))
}


sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(op: String, nodes: BinaryTree*) extends BinaryTree