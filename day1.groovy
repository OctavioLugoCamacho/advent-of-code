//First Part
def directions = ")())())"
def position = 0

directions.each { it ->
    if(it == "(") {position++}
    else {position--}
}

println position

//Second Part
def directions = "()())"
def position = 0
def positions = []

directions.eachWithIndex { it, index ->
    if(it == "(") {position++}
    else {position--}
    if(position == -1) {positions.add(index + 1)}
}

println positions[0]