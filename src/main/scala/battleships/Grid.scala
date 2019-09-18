package battleships

import java.util.Optional

class PlayerGrid(listShips: Map[List[Cell], Ship]) {

  def isSunk(ship: Ship) = {
    val result = listShips.find(p => p._2.equals(ship))
    if (!result.isEmpty) {
      result.get._1.forall(cell => cell.isHit())
    } else false
  }

  def areSunk() = {
    listShips.values.forall(ship => isSunk(ship))
  }
}

class FoeGrid(listCells: List[Cell] = List()) {

  def occupiedCells() = listCells.filter(cell => cell.isHit && !cell.isEmpty)

  def missedCells() = listCells.filter(cell => cell.isHit && cell.isEmpty)

  def hitCells() = listCells.filter(cell => cell.isHit() && !cell.isEmpty)

}
