/** Bigint's can be used seamlessly */
object bigint extends App {
  def factorial(n: BigInt): BigInt =
    if (n == 0) 1 else n * factorial(n-1)

  for (i <- 1 to 30) println(i + "! = " + factorial(i))
}
