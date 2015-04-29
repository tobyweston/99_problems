
import org.specs2.mutable.Specification

class P04Test extends Specification {

  val implementations = List(
    P04.length _,
    P04.length2 _
  )

  implementations.zipWithIndex.map { value =>
    "implementation " + value._2 >> {
      val implementation = value._1

      "length of list" >> {
        implementation(List(1, 1, 2, 3, 5, 8)) must_== 6
        implementation(List(5, 8)) must_== 2
      }

      "empty list" >> {
        implementation(List()) must_== 0
      }
    }
  }
}
