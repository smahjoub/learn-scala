
val NO_OF_ITERATIONS = 100000
println(s"Estimating the value of Pi using Monte Carlo with $NO_OF_ITERATIONS iterations using tail recursion")


def estimatePi(n:Int): Double = {
  import scala.annotation.tailrec
  @tailrec
  def helper(n:Int, sum:Int):Int = {
    if(n < 1) sum else {
      val x = math.random()
      val y = math.random()
      helper(n - 1, (if (x*x + y*y <= 1) sum + 1 else sum) )
    }
  }
  4 * (helper(n, 0).toDouble / n)
}

println(estimatePi(NO_OF_ITERATIONS).toString)
