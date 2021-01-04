

// Partial function that takes Any and return a string
val pf:PartialFunction[Any, String] = {
	case i:Int => "Int Param"
	case s:String => "String Param"
}

println(pf(0))

println(pf("Hello world"))