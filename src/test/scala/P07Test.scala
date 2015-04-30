import P07._
import org.specs2.mutable.Specification

class P07Test extends Specification {

  "flatten" >> {
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) must_== List(1, 1, 2, 3, 5, 8)
  }

  "empty list" >> {
    flatten(List()) must_== List()
  }

}
