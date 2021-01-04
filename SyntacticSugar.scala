


def func(i:Int): Unit= println(i)



func{
	println("hello world")
	8
}


def myWhile(cond: => Boolean)(body: => Unit): Unit ={
	if(cond){
		body
		myWhile(cond)(body)
	}
}



var i = 0

myWhile(i < 5) {
	println(s"I from mywhile ${i}")
	i += 1
}