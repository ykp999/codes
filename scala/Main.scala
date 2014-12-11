/** Turn command line arguments to uppercase */
object Main {
  def main(args: Array[String]) {
    val res = for (a <- args) yield a.toUpperCase
    println("Arguments: " + res)

	val test = Array("i", "love", "you")
	println(test);

	val test1 = for (a <- test) yield a.toUpperCase
	println(test1);

	val test2 = ("i", "love", "you")
  }
}
