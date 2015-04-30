import P06._
import org.specs2.mutable.Specification

class P06Test extends Specification {

  "palindrome" >> {
    isPalindrome(List(1, 2, 3, 2, 1)) must_== true
  }

  "empty list" >> {
    isPalindrome(List()) must_== true
  }

  "not a palindrome" >> {
    isPalindrome(List(1, 2, 3, 2, 4)) must_== false
  }
}
