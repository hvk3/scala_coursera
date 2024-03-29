package week4

object nth {
	println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet
	def nth[T](n: Int, xs: List[T]): T = {
		if (xs.isEmpty) throw new IndexOutOfBoundsException();
		else if (n == 0) xs.head
		else nth(n - 1, xs.tail)
	}                                         //> nth: [T](n: Int, xs: week4.List[T])T
	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week4.Cons[Int] = week4.Cons@880ec60
	nth(4, list)                              //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week4.nth$$anonfun$main$1.nth$1(week4.nth.scala:6)
                                                  //| 	at week4.nth$$anonfun$main$1.apply$mcV$sp(week4.nth.scala:11)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week4.nth$.main(week4.nth.scala:3)
                                                  //| 	at week4.nth.main(week4.nth.scala)
}