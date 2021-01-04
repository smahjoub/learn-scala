

println("This is an example of parsing csv file using iterators in scala.")

case class Car(val name: String, val mpg: Double, val cylinders: Int,val displacement: Double,
	val horsepower: Double,val weight: Double,val acceleration: Double,val model: Int,val origin: String) 

def parseCar(line: String): Car = {
	val values = line.split(";").map(_.trim)

	Car(
		values(0), // name
		values(1).toDouble, // mpg
		values(2).toInt, // cylinders
		values(3).toDouble, // displacement
		values(4).toDouble, // horsepower
		values(5).toDouble, // weight
		values(6).toDouble, // acceleration
		values(7).toInt, // model
		values(8), // origin
	)
}
	

var currentDir = new java.io.File("").getAbsolutePath()
val absolutePath = s"${currentDir}/cars.csv"

println(s"Parsing the following csv file: ${absolutePath}")

val source = io.Source.fromFile(absolutePath)
val lines = source.getLines

println(s"File header ${lines.next}")
println(s"File header ${lines.next}")

var parsedData = lines.map(parseCar).toArray
var maxMpg = parsedData.map(_.mpg).max

println(s"Max MPG ${maxMpg}")
source.close