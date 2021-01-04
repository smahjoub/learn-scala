


for(i <- 0 until 5; j <- 0 until 5; a = i+j) yield i*j+a


for{i <- 0 until 5
	if i % 2 == 0
 	j <- 0 until 5
 	a = i+j } yield i*j+a