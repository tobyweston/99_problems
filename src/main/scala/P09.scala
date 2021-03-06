
// P09 (**) Pack consecutive duplicates of list elements into sublists.
//     If a list contains repeated elements they should be placed in separate
//     sublists.
//
//     Example:
//     scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

object P09 extends App {

  def pack[A](list: List[A]): List[List[A]] = {
    val (duplicates, remaining) = list.span(_ == list.head)
    (duplicates, remaining) match {
      case (e, Nil) => List(e)
      case _ => duplicates +: pack(remaining)
    }
  }

}