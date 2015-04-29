

// P04(*) Find the number of elements of a list.
//
//     Example:
//     scala > length (List(1, 1, 2, 3, 5, 8))
//     res0: Int = 6

object P04 extends App {

  def length[A](list: List[A]): Int = {
    def length(count: Int, list: List[A]): Int = {
      (count, list) match {
        case (count, Nil) => count
        case (count, _ :: tail) => length(count + 1, tail)
      }
    }
    length(0, list)
  }

}