package co.gersua.la

case class Vector(coordinates: List[Double]) {

  val tolerance = 1e-10

  def +(other: Vector): Vector = {
    Vector(for ((x, y) <- coordinates zip other.coordinates) yield x + y)
  }

  def unary_! : Vector = {
    Vector(coordinates.map(_ * -1))
  }

  def -(other: Vector): Vector = {
    this + !other
  }

  def scalarMult(scalar: Double): Vector = {
    Vector(coordinates.map(_ * scalar))
  }

  val magnitude: Double = {
    //Math.sqrt({for (x <- coordinates) yield x * x}.foldLeft(0.0)((x, y) => x + y))
    Math.sqrt(coordinates.map(x => x * x).foldLeft(0.0)((x, y) => x + y))
  }

  def unit: Vector = {
    if (magnitude == 0) throw new IllegalStateException("Magnitude is 0.")
    scalarMult(1.0 / magnitude)
  }

  def dotProduct(other: Vector): Double = {
    (for ((x, y) <- coordinates zip other.coordinates) yield x * y).sum
  }

  def calculateAngle(other: Vector, degree: Boolean): Double = {
    if (magnitude == 0 || other.magnitude == 0) throw new IllegalStateException("Magnitude is 0 when calculating Angle.")
    else {
      val factor = if (degree) 180 / scala.math.Pi else 1
      scala.math.acos(dotProduct(other) / (magnitude * other.magnitude)) * factor
    }
  }

  def isZero(): Boolean = {
    magnitude < tolerance
  }

  def isOrthogonalTo(other: Vector): Boolean = {
    return scala.math.abs(dotProduct(other)) < tolerance
  }

  def isParallelTo(other: Vector): Boolean = {
    this.isZero() || other.isZero() || calculateAngle(other, false) == 0 || calculateAngle(other, false) == scala.math.Pi
  }
}
