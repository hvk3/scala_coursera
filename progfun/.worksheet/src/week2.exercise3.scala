package week2

object exercise3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(133); 
	def prod(f: Int => Int)(a: Int, b: Int): Int = {
		if (a > b) 1
		else f(a) * prod(f)(a + 1, b)
	};System.out.println("""prod: (f: Int => Int)(a: Int, b: Int)Int""");$skip(24); val res$0 = 
	prod(x => x * x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(44); 
	def factorial(n: Int) = prod(x => x)(1, n);System.out.println("""factorial: (n: Int)Int""");$skip(14); val res$1 = 
	factorial(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(171); 

	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
		if (a > b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a + 1, b));System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(90); 
	
	def prod1(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (a, b) => a * b, 1)(a, b);System.out.println("""prod1: (f: Int => Int)(a: Int, b: Int)Int""");$skip(25); val res$2 = 
	prod1(x => x * x)(3, 5);System.out.println("""res2: Int = """ + $show(res$2))}
}
