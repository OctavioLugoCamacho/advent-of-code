//First part
def a

for (int k; k<10000000; k++)
{
    def value = "pqrstuv"
    a = k
    def stringLen = 6
    def strLen = a.toString().size()
    expectedLen = stringLen.toInteger() - strLen.toInteger()
    for(i = 0; i<=expectedLen-1;i++)
    {
    	a = "0" + a
    }
    value += a
    def md5 = value.md5()
    if (md5[0].equals("0") && md5[1].equals("0") && md5[2].equals("0") && md5[3].equals("0") && md5[4].equals("0")) {
        println a
        println md5
    }
}

//Second part
def a

for (int k; k<10000000; k++)
{
    def value = "iwrupvqb"
    a = k
    def stringLen = 6
    def strLen = a.toString().size()
    expectedLen = stringLen.toInteger() - strLen.toInteger()
    for(i = 0; i<=expectedLen-1;i++)
    {
    	a = "0" + a
    }
    value += a
    def md5 = value.md5()
    if (md5[0].equals("0") && md5[1].equals("0") && md5[2].equals("0") && md5[3].equals("0") && md5[4].equals("0") && md5[5].equals("0")) {
        println a
        println md5
    }
}
