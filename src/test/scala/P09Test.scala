import P09._
import org.specs2.mutable.Specification

class P09Test extends Specification {

  "pack" >> {
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) must_== List(
      List('a, 'a, 'a, 'a),
      List('b),
      List('c, 'c),
      List('a, 'a),
      List('d),
      List('e, 'e, 'e, 'e))
  }

  "empty list" >> {
    pack(List()) must_== List()
  }

}
