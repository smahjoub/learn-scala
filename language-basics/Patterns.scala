
val strings = "This is a test of split method".split(" ").toList

// get list length with pattern matching

def lstLength(lst:List[String]): Int =  lst match {
	case Nil => 0
	case h::t => 1 + lstLength(t)
}

println(s"This size of the list is ${lstLength(strings)}")


// pattern matching to create variables
val Array(hour, minute, second) = "12:02:05".split(":")

println(s"This time is ${hour}:${minute}:${second}")


case class Person(val name:String, val age: Int)


val people = Array(Person("Saifeddine", 30), Person("Amine", 32))

val Person(n,a) = people(0)

println(s"This first person in the list ${n}, ${a}")