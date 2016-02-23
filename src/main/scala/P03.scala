
// P03 (*) Find the Kth element of a list.
//     By convention, the first element in the list is element 0.
//
//     Example:
//     scala> nth(2, List(1, 1, 2, 3, 5, 8))
//     res0: Int = 2

object P03 extends App {

  def nth[A](n: Int, list: List[A]): A = {
    (n, list) match {
      case (_, Nil) => throw new NoSuchElementException
      case (0, list) => list.head
      case (n, list) => nth(n - 1, list.tail)
    }
  }

  def nth2[A](n: Int, list: List[A]): A = {
    (n, list) match {
      case (0, head :: tail) => head
      case (n, _ :: tail) => nth2(n - 1, tail)
      case _ => throw new NoSuchElementException
    }
  }

}