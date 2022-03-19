//First part
String input = "^v^v^v^v^v"
def santa = []

def generalList = input.collect {it}
generalList.each {it ->
    santa.add(it)
}

Integer x = 0
Integer y = 0
def houses = [[0,0]]
santa.each { i ->
    if (i == ">") {x++}
    if (i == "<") {x--}
    if (i == "^") {y++}
    if (i == "v") {y--}
    houses.add([x,y])
}

println("Houses: ${houses.unique().size()}")

//Second part
String input = "^v"
def santa = []
def robot = []

def generalList = input.collect {it}
generalList.eachWithIndex{it,index->
    if (index % 2 == 0) {santa.add(it)}
    else {robot.add(it)}
}

Integer x = 0
Integer y = 0
def houses = [[0,0]]
santa.each { i ->
    if (i == ">") {x++}
    if (i == "<") {x--}
    if (i == "^") {y++}
    if (i == "v") {y--}
    houses.add([x,y])
}

x = 0
y = 0
robot.each { i ->
    if (i == ">") {x++}
    if (i == "<") {x--}
    if (i == "^") {y++}
    if (i == "v") {y--}
    houses.add([x,y])
}

println("Houses: ${houses.unique().size()}")