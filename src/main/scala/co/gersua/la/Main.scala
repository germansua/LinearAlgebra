package co.gersua.la

object Main extends App {

  println("Addition, Subtraction and Scalar Multiplication Test")
  println(Vector(List(8.218, -9.341)) + Vector(List(-1.129, 2.111)))
  println(Vector(List(7.119, 8.215)) - Vector(List(-8.223, 0.878)))
  println(Vector(List(1.671, -1.012, -0.318)) scalarMult 7.41)
  println()

  println("Magnitude Test")
  println(Vector(List(-0.221, 7.437)).magnitude)
  println(Vector(List(8.813, -1.331, -6.247)).magnitude)
  println()

  println("Unit Test")
  println(Vector(List(5.581, -2.136)).unit)
  println(Vector(List(1.996, 3.108, -4.554)).unit)
  // Vector(List(0, 0)).unit // Should throws an exception
  println()

  println("Dot Multiplication Test")
  println(Vector(List(7.887, 4.138)) dotProduct Vector(List(-8.802, 6.776)))
  println(Vector(List(-5.955, -4.904, -1.874)) dotProduct Vector(List(-4.496, -8.755, 7.103)))
  println()

  println("Calculate Angle Radians and Degrees")
  println(Vector(List(3.183, -7.627)) calculateAngle(Vector(List(-2.668, 5.319)), false))
  println(Vector(List(7.35, 0.221, 5.188)) calculateAngle(Vector(List(2.751, 8.259, 3.985)), true))
  println()

  println("Calculate Parallel and Orthogonals")
  println(Vector(List(-7.579, -7.88)) isOrthogonalTo Vector(List(22.737, 23.64)))
  println(Vector(List(-7.579, -7.88)) isParallelTo Vector(List(22.737, 23.64)))

  println(Vector(List(-2.029, 9.97, 4.174)) isOrthogonalTo Vector(List(-9.231, -6.639, -7.245)))
  println(Vector(List(-2.029, 9.97, 4.174)) isParallelTo Vector(List(-9.231, -6.639, -7.245)))

  println(Vector(List(-2.328, -7.284, -1.214)) isOrthogonalTo Vector(List(-1.821, 1.072, -2.94)))
  println(Vector(List(-2.328, -7.284, -1.214)) isParallelTo Vector(List(-1.821, 1.072, -2.94)))

  println(Vector(List(2.118, 4.827)) isOrthogonalTo Vector(List(0, 0)))
  println(Vector(List(2.118, 4.827)) isParallelTo Vector(List(0, 0)))
  println()
}
