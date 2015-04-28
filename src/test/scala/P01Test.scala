import P01._

class P01Test extends org.specs2.mutable.Specification {

  "get last element" >> {
    last(List(1, 1, 2, 3, 5, 8)) must_== 8
  }

  "empty list" >> {
    last(List.empty[Int]) must throwA[IllegalArgumentException]
  }

  "single element list" >> {
    last(List(1)) must_== 1
  }

}
