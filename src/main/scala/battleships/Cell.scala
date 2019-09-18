package battleships

abstract class Cell(isHit: Boolean) {
  val _isHit: Boolean = isHit

  def isEmpty : Boolean

  def isHit() = _isHit
}

case class OccupiedCell(override val isHit: Boolean = false) extends Cell(isHit){
  override def isEmpty = false
}

case class EmptyCell(override val isHit: Boolean = false) extends Cell(isHit){
  override def isEmpty = true
}
