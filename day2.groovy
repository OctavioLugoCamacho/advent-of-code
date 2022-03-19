//First part
Integer paper = 0
Integer extraPaper = 0
Integer total = 0
def totalPaper = []
new File("prueba.txt").eachLine {
    dimensions -> {
        paper = 0
        extraPaper = 0
        Integer l = dimensions.split("x")[0] as Integer
        Integer w = dimensions.split("x")[1] as Integer
        Integer h = dimensions.split("x")[2] as Integer
        def cadena = [l,w,h]
        paper = (2*l*w)+(2*w*h)+(2*l*h)
        extraPaper = cadena.sort()[0] * cadena.sort()[1]
        total = paper + extraPaper
        totalPaper.add(total)
    }
}
println totalPaper.sum()

//Second part
Integer paper = 0
Integer extraPaper = 0
Integer total = 0
def totalPaper = []
new File("prueba.txt").eachLine {
    dimensions -> {
        paper = 0
        extraPaper = 0
        Integer l = dimensions.split("x")[0] as Integer
        Integer w = dimensions.split("x")[1] as Integer
        Integer h = dimensions.split("x")[2] as Integer
        def cadena = [l,w,h]
        paper = l*w*h
        extraPaper = cadena.sort()[0] + cadena.sort()[0] + cadena.sort()[1] + cadena.sort()[1]
        total = paper + extraPaper
        totalPaper.add(total)
    }
}
println totalPaper.sum()
