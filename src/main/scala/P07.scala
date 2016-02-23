
// P07 (**) Flatten a nested list structure.
//     Example:
//     scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//     res0: List[Any] = List(1, 1, 2, 3, 5, 8)

object P07 extends App {

  def flatten[A](list: List[A]): List[A] = {
    list.flatMap {
      case l: List[A] => flatten(l)
      case l => List(l)
    }
  }

  def flatten2[A](list: List[A]): List[A] = {
    list match {
      case Nil => List()
      case (head: List[A]) :: tail => flatten2(head) ++ flatten2(tail)
      case head :: tail => head :: flatten2(tail)
    }
  }

}