import scala.annotation.tailrec

// P04(*) Find the number of elements of a list.
//
//     Example:
//     scala > length (List(1, 1, 2, 3, 5, 8))
//     res0: Int = 6

object P04 extends App {

  def length[A](list: List[A]): Int = {
    @tailrec
    def length(count: Int, list: List[A]): Int = {
      (count, list) match {
        case (count, Nil) => count
        case (count, _ :: tail) => length(count + 1, tail)
      }
    }
    length(0, list)
  }

  def length2[A](list: List[A]): Int = {
    list match {
      case Nil => 0
      case _ :: tail => 1 + length2(tail)
    }
  }

  def length3[A](list: List[A]): Int = {
    list.foldLeft(0) {
      (c, _) => c + 1
    }
  }
}