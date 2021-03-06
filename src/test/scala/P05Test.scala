import P05._
import org.specs2.mutable.Specification

class P05Test extends Specification {

  val implementations: List[(List[Int]) => List[Int]] = List(
    reverse _,
    reverse2 _,
    reverse3 _
  )

  implementations.zipWithIndex.map { value =>
    "implementation " + value._2 >> {
      val implementation = value._1

      "reverse a list" >> {
        implementation(List(1, 1, 2, 3, 5, 8)) must_== List(8, 5, 3, 2, 1, 1)
      }

      "empty list" >> {
        implementation(List()) must_== List()
      }
    }
  }
}
