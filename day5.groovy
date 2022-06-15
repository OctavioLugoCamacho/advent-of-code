//First Part
def count = 0
new File("strings.txt").eachLine {
  string -> {
    def vowels = 0
    def bad = 0
    def repeat = 0

    string.each {
      if(it.equals("a") || it.equals("e") || it.equals("i") || it.equals("o") || it.equals("u")) { vowels++ }
    }

    for(int i in 0..string.size()-2) {
      if(string[i].equals(string[i + 1])) { repeat++ }
      if(string[i] == "a" && string[i + 1] == "b") { bad++ }
      if(string[i] == "c" && string[i + 1] == "d") { bad++ }
      if(string[i] == "p" && string[i + 1] == "q") { bad++ }
      if(string[i] == "x" && string[i + 1] == "y") { bad++ }
    }

    if(vowels >= 3 && repeat >= 1 && bad == 0) { count++ }
  }
}

//Second Part
def count = 0
new File("strings.txt").eachLine {
  string -> {
    def pair = 0
    def repeats = 0

    for(int i in 0..string.size()-3) {
      if(string[i].equals(string[i + 2])) { repeats++ }
    }

    for(int i in 0..string.size()-4) {
      for(int j in i+2..string.size()-2) {
        if(string[i].equals(string[j]) && string[i + 1].equals(string[j + 1])) { pair++ }
      }
    }

    if(pair > 0 && repeats > 0) { count++ }
  }
}