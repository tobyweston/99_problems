
// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5

object P02 extends App {

  def penultimate[A](list: List[A]): A = {
    list match {
      case _ :: tail if (tail.size == 2) => tail.head
      case _ :: tail => penultimate(tail)
      case _ => throw new IllegalArgumentException
    }
  }
}