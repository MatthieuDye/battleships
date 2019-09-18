package battleships

import battleships.Cell
import org.scalatest._

class battleShipTestsScala extends FunSpec with Matchers with GivenWhenThen with BeforeAndAfter {

  describe("If I want to test something") {
    describe("I can tests whatever I want like that :") {
      it("A new created undefined Cell has no properties") {
        assert( 1 == 2-1)
      }
    }
  }

  describe("A nonhit list") {
    val list = OccupiedCell(false) :: Nil
      it("return something") {
        assert(list.forall(cell => cell.isHit) == false)}


  }

  describe("An hit list") {
    val list = OccupiedCell(true) :: Nil
    it("return something") {
      assert(list.forall(cell => cell.isHit))}


  }

}
