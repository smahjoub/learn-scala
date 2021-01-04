

val s = Set(1, 2, 3, 4)
// Sets and Maps are per default immutable
s + 5 

println(s.size)

val s2 = s + 5

println(s2.size)


import collection.mutable

// use mut prefix for mutable variable 
val mutSet = mutable.Set(1, 2, 3, 4)

mutSet += 5

println(mutSet.size)

val m = Map("key" -> "value", "key2" -> "value2")

val m2 = Map(("key", "value"), ("key2", "value2"))

val mutMap = mutable.Map("key" -> "value", "key2" -> "value2")


println(mutMap("key"))