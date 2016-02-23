import P03._

import org.specs2.mutable.Specification

class P03Test extends Specification {

  val implementations: List[(Int, List[Int]) => Int] = List(
    nth(_, _),
    nth2(_, _)
  )

  implementations.zipWithIndex.foreach { value =>
    "implementation " + value._2 >> {

      val implementation = value._1

      "get nth element" >> {
        implementation(0, List(1, 1, 2, 3, 5, 8)) must_== 1
        implementation(1, List(1, 1, 2, 3, 5, 8)) must_== 1
        implementation(2, List(1, 1, 2, 3, 5, 8)) must_== 2
        implementation(3, List(1, 1, 2, 3, 5, 8)) must_== 3
        implementation(4, List(1, 1, 2, 3, 5, 8)) must_== 5
        implementation(5, List(1, 1, 2, 3, 5, 8)) must_== 8
      }

      "empty list" >> {
        implementation(0, List.empty[Int]) must throwA[NoSuchElementException]
      }

      "element not found in list" >> {
        implementation(-1, List(1)) must throwA[NoSuchElementException]
        implementation(1, List(1)) must throwA[NoSuchElementException]
      }
    }
  }
}
