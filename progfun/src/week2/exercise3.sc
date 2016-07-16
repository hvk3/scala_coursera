package week2

object exercise3 {
	def prod(f: Int => Int)(a: Int, b: Int): Int = {
		if (a > b) 1
		else f(a) * prod(f)(a + 1, b)
	}                                         //> prod: (f: Int => Int)(a: Int, b: Int)Int
	prod(x => x * x)(3, 4)                    //> res0: Int = 144
	def factorial(n: Int) = prod(x => x)(1, n)//> factorial: (n: Int)Int
	factorial(5)                              //> res1: Int = 120

	def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
		if (a > b) zero
		else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
                                                  //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
	
	def prod1(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (a, b) => a * b, 1)(a, b)
                                                  //> prod1: (f: Int => Int)(a: Int, b: Int)Int
	prod1(x => x * x)(3, 5)                   //> res2: Int = 3600
}