package project.euler

object Problem002 {

  val limit = 4000000


  def main(args: Array[String]) {

    println(fib(0, 1, 0))

  }

  def fib(prev: Long, current: Long, sum: Long): Long = {
    val next = prev + current

    if(next > limit) {
      return sum
    } else {
      if(next%2 == 0) fib(current, next, sum + next) else fib(current, next, sum)
    }

  }

}