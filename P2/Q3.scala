def salPerWh(Wh:Float):Float=Wh*250
def salPerOth(Oth:Float):Float=Oth*85
def totSal(Wh:Float,Oth:Float):Float=salPerWh(Wh)+salPerOth(Oth)
def tax(totSal:Float):Float=totSal*12/100
def takeHomeSal(Wh:Float,Oth:Float):Float=totSal(Wh,Oth)-tax(totSal(Wh,Oth))

def main(args:Array[String]):Unit={
    var ths=takeHomeSal(40,30)
    printf("Monthly take home salary is : "+ths)
}