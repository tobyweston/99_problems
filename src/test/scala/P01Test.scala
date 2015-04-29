import P01._
import org.specs2.mutable.Specification

class P01Test extends Specification {

  "get last element" >> {
    last(List(1, 1, 2, 3, 5, 8)) must_== 8
  }

  "empty list" >> {
    last(List.empty[Int]) must throwA[NoSuchElementException]
  }

  "single element list" >> {
    last(List(1)) must_== 1
  }

}
