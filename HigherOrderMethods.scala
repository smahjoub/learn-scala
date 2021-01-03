val a = Array(1, 2, 3, 4, 5)
val b = List(5, 3, 4, 19, -1)
val c = Vector.tabulate(10)(i => i * i)

//c.foreach(println)
println(c.mkString("(", ", ", ")"))

a.map(i => b.take(i)).flatten.foreach(println)

a.exists(_>50)
c.forall(_<50)

println(a.reduceLeft((x, y) => x + y)) // println(a.reduceLeft(_+_))

println(a.foldLeft("0")((x, y) => x + y)) // println(a.reduceLeft(_+_))