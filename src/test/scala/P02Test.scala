import P02._

class P02Test extends org.specs2.mutable.Specification {

  val implementations: List[(List[Int]) => Int] = List(
    penultimate _,
    penultimate2 _,
    penultimate3 _
  )

  implementations.zipWithIndex.foreach { value =>
    "implementation " + value._2 >> {
      val implementation = value._1
      "get last element" >> {
        implementation(List(1, 1, 2, 3, 5, 8)) must_== 5
      }

      "empty list" >> {
        implementation(List.empty[Int]) must throwA[NoSuchElementException]
      }

      "single element list" >> {
        implementation(List(1)) must throwA[NoSuchElementException]
      }
    }
  }
}
