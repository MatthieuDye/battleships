package battleships

abstract class Ship(firstCell: Cell, dir: Direction.Value, len: Int) {
  val _direction = dir
  val _length = len

  def direction() : Direction.Value = _direction

  def length() : Int = _length

  override def toString: String = this.getClass.toString

}

object Direction extends Enumeration {
  type Direction = Value
  val HORIZONTAL, VERTICAL = Value
}

case class Carrier(firstCell: Cell, dir: Direction.Value) extends Ship(firstCell, dir, 5)
case class Battleship(firstCell: Cell, dir: Direction.Value) extends Ship(firstCell, dir, 4)
case class Submarine(firstCell: Cell, dir: Direction.Value) extends Ship(firstCell, dir, 3)
case class Cruiser(firstCell: Cell, dir: Direction.Value) extends Ship(firstCell, dir, 3)
case class Destroyer(firstCell: Cell, dir: Direction.Value) extends Ship(firstCell, dir, 2)