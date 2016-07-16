package week2

import math.abs

object fixed_points {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
	val tolerance = 0.00001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(75); 

	def isCloseEnough(x: Double, y: Double) =
		abs((x - y) / x) < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(248); 

	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			println("guess : " + guess)
			val next = f(guess)
			if (isCloseEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(67); 

	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(63); 

	def sqrt(x: Double) = fixedPoint(averageDamp(y => x / y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(9); val res$0 = 
	sqrt(2);System.out.println("""res0: Double = """ + $show(res$0))}

}
