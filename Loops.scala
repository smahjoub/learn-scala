

var i = 0

while(i < 5){
	println(s"I=${i}")
	i = i + 1
}

for(i <- 1 to 5){
	println(s"I=${i}")
}


for(i <- 0 until 5){
	println(s"I=${i}")
}

val array = Array.fill(10)(Math.random)


for(x <- array){
	println(s"X=${x}")
}


for(x <- array) yield x*x // array.map(x => x*x)
