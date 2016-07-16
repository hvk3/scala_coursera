package week1

object session {

	val x = 2                                 //> x  : Int = 2
	def f(y: Int) = y + 1                     //> f: (y: Int)Int
	var result = {
		val x = f(3)
		x * x
	} + x                                     //> result  : Int = 18

	def abs(x: Double) =
		if (x < 0) -x
		else x                            //> abs: (x: Double)Double

	def sqrt(x: Double) = {
		def sqrtIter(guess: Double): Double =
			if (isGoodEnough(guess)) guess
			else sqrtIter(improve(guess))

		def isGoodEnough(guess: Double) =
			abs(guess * guess - x) / x < 0.001

		def improve(guess: Double) =
			(guess + x / guess) / 2
		sqrtIter(1)
	}                                         //> sqrt: (x: Double)Double
	sqrt(1e-6)                                //> res0: Double = 0.0010000001533016628
}