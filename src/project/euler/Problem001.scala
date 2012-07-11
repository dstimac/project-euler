package project.euler

object Problem001 {

  def main(args: Array[String]) {

    var tmp = 0
	for (num <- 1 until 1000)
	  if( (num % 3 == 0) || (num % 5 == 0) )
	    tmp += num

	println(tmp)
  }

}