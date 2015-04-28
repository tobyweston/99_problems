import P02._

class P02Test extends org.specs2.mutable.Specification {

  "get last element" >> {
    penultimate(List(1, 1, 2, 3, 5, 8)) must_== 5
  }

  "empty list" >> {
    penultimate(List.empty[Int]) must throwA[IllegalArgumentException]
  }

  "single element list" >> {
    penultimate(List(1)) must throwA[IllegalArgumentException]
  }

}
