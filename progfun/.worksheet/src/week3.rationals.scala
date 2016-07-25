package week3

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

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(643); 
	val x = new Rational(1, 3);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(28); 
	val y = new Rational(5, 7);System.out.println("""y  : week3.Rational = """ + $show(y ));$skip(28); 
	val z = new Rational(3, 2);System.out.println("""z  : week3.Rational = """ + $show(z ));$skip(11); val res$0 = 
	x - y - z;System.out.println("""res0: week3.Rational = """ + $show(res$0));$skip(7); val res$1 = 
	y + y;System.out.println("""res1: week3.Rational = """ + $show(res$1));$skip(7); val res$2 = 
	x < y;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(9); val res$3 = 
	x max y;System.out.println("""res3: week3.Rational = """ + $show(res$3))}
}
