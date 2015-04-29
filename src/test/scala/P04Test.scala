
import org.specs2.mutable.Specification

class P04Test extends Specification {

  "length of list" >> {
    P04.length(List(1, 1, 2, 3, 5, 8)) must_== 6
    P04.length(List(5, 8)) must_== 2
  }

  "empty list" >> {
    P04.length(List()) must_== 0
  }
}
