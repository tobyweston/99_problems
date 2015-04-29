import P03._

class P03Test extends org.specs2.mutable.Specification {

  "get nth element" >> {
    nth(0, List(1, 1, 2, 3, 5, 8)) must_== 1
    nth(1, List(1, 1, 2, 3, 5, 8)) must_== 1
    nth(2, List(1, 1, 2, 3, 5, 8)) must_== 2
    nth(3, List(1, 1, 2, 3, 5, 8)) must_== 3
    nth(4, List(1, 1, 2, 3, 5, 8)) must_== 5
    nth(5, List(1, 1, 2, 3, 5, 8)) must_== 8
  }

  "empty list" >> {
    nth(0, List.empty[Int]) must throwA[NoSuchElementException]
  }

  "element not found in list" >> {
    nth(-1, List(1)) must throwA[NoSuchElementException]
    nth(1, List(1)) must throwA[NoSuchElementException]
  }
}
