import P08._
import org.specs2.mutable.Specification

class P08Test extends Specification {

  val implementations: List[(List[Symbol]) => List[Symbol]] = List(
    compress _,
    compress2 _,
    compress3 _,
    compress4 _,
    compress5 _
  )

  implementations.zipWithIndex.map { value =>
    "implementation " + value._2 >> {
      val implementation = value._1

      "compress" >> {
        implementation(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must_== List('a, 'b, 'c, 'a, 'd, 'e)
        implementation(List('a, 'b, 'c)) must_== List('a, 'b, 'c)
      }

      "empty list" >> {
        implementation(List()) must_== List()
      }
    }
  }
}
