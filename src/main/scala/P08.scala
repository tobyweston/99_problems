
// P08 (**) Eliminate consecutive duplicates of list elements.
//     If a list contains repeated elements they should be replaced with a
//     single copy of the element.  The order of the elements should not be
//     changed.
//
//     Example:
//     scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

object P08 extends App {

  def compress[A](list: List[A]): List[A] = {
    if (list.isEmpty) return list
    list match {
      case head :: Nil => List(head)
      case head :: tail if head == tail.head => compress(tail)
      case head :: tail => head +: compress(tail)
    }
  }

  def compress2[A](ls: List[A]): List[A] = {
    def dropWhile(predicate: A => Boolean)(list: List[A]): List[A] = {
      if (list.isEmpty || !predicate(list.head)) list else dropWhile(predicate)(list.tail)
    }

    ls match {
      case Nil => Nil
      case head :: tail => head +: compress2(dropWhile(_ == head)(tail))
    }
  }

}