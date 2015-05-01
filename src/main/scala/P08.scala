
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
    if (list.isEmpty) return List()
    list match {
      case head :: Nil => List(head)
      case head :: tail if head == tail.head => compress(tail)
      case head :: tail => head +: compress(tail)
    }
  }

  def compress2[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => head +: compress2(tail.dropWhile(_ == head))
  }

  def compress3[A](list: List[A]): List[A] = {
    def dropWhile(predicate: A => Boolean, list: List[A]): List[A] = {
      if (list.isEmpty || !predicate(list.head)) list else dropWhile(predicate, list.tail)
    }

    list match {
      case Nil => Nil
      case head :: tail => head +: compress2(dropWhile(_ == head, tail))
    }
  }

  import ListOps._
  def compress4[A](list: List[A]): List[A] = {
    list match {
      case Nil => Nil
      case head :: tail => head +: compress2(tail.dropWhile2(_ == head))
    }
  }

  def compress5[A](list: List[A]): List[A] = {
    def compress(result: List[A], current: List[A]): List[A] = {
      current match {
        case Nil => result
        case head :: tail => compress(result :+ head, tail.dropWhile(_ == head))
      }
    }
    compress(Nil, list)
  }
}

object ListOps {
  implicit class ListExtension[A](val list: List[A]) {
    def dropWhile2(predicate: A => Boolean): List[A] = {
      if (list.isEmpty || !predicate(list.head)) list else list.tail.dropWhile2(predicate)
    }
  }
}