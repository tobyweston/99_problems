import scala.annotation.tailrec

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

  def reverse2[A](list: List[A]): List[A] = {
    @tailrec
    def reverse(result: List[A], current: List[A]): List[A] = {
      current match {
        case Nil => result
        case head :: tail => reverse(head +: result, tail)
      }
    }
    reverse(List[A](), list)
  }

  def reverse3[A](list: List[A]): List[A] = {
    list.foldLeft(List[A]()) {
      (list, element) => element +: list
    }
  }
}