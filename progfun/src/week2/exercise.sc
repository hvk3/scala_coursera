package week2

object exercise {
	def factorial(n: Int): Int = {
		def loop(acc: Int, n: Int): Int =
			if (n == 0) acc
			else loop(acc * n, n - 1)
		loop(1, n)
	}                                         //> factorial: (n: Int)Int
	factorial(8)                              //> res0: Int = 40320
}