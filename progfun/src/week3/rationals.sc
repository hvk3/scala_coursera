package week3

object rationals {
	val x = new Rational(1, 3)                //> x  : week3.Rational = 1/3
	val y = new Rational(5, 7)                //> y  : week3.Rational = 5/7
	val z = new Rational(3, 2)                //> z  : week3.Rational = 3/2
	x - y - z                                 //> res0: week3.Rational = -79/42
	y + y                                     //> res1: week3.Rational = 10/7
	x < y                                     //> res2: Boolean = true
	x max y                                   //> res3: week3.Rational = 5/7
}

class Rational(x: Int, y: Int) {
	require(y != 0, "Denominator cannot be zero")
	private def gcd(a: Int, b: Int): Int =
		if (b == 0) a
		else gcd(b, a % b)

	def numer = x
	def denom = y

	def <(that: Rational) = numer * that.denom < denom * that.numer

	def max(that: Rational) = if (this < that) that else this

	def +(that: Rational) = {
		new Rational(numer * that.denom + denom * that.numer, denom * that.denom)
	}

	def -(that: Rational) = this + -that

	def unary_- =
		new Rational(-x, y)

	override def toString = {
		val g = gcd(x, y)
		numer / g + "/" + denom / g
	}
}