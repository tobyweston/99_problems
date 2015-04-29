
// P05 (*) Reverse a list.
//     Example:
//     scala> reverse(List(1, 1, 2, 3, 5, 8))
//     res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object P05 extends App {

  def reverse[A](list: List[A]): List[A] = {
    list match {
      case Nil => List()
      case head :: tail => reverse(tail) :+ head
    }
  }
}