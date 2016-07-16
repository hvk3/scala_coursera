package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(43); 

	val x = 2;System.out.println("""x  : Int = """ + $show(x ));$skip(23); 
	def f(y: Int) = y + 1;System.out.println("""f: (y: Int)Int""");$skip(46); 
	var result = {
		val x = f(3)
		x * x
	} + x;System.out.println("""result  : Int = """ + $show(result ));$skip(48); 

	def abs(x: Double) =
		if (x < 0) -x
		else x;System.out.println("""abs: (x: Double)Double""");$skip(284); 

	def sqrt(x: Double) = {
		def sqrtIter(guess: Double): Double =
			if (isGoodEnough(guess)) guess
			else sqrtIter(improve(guess))

		def isGoodEnough(guess: Double) =
			abs(guess * guess - x) / x < 0.001

		def improve(guess: Double) =
			(guess + x / guess) / 2
		sqrtIter(1)
	};System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$0 = 
	sqrt(1e-6);System.out.println("""res0: Double = """ + $show(res$0))}
}
