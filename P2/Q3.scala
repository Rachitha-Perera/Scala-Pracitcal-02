def salary(wH:Float,otH:Float):Float=if(wH/2<40 && otH/2<30) ((wH*250)+(otH*85)) else ((wH*250)+(otH*85))*88/100
def main(args:Array[String]):Unit={
    var takeHomeSalary=salary(80,60);
    printf("Monthly take home salary is : "+takeHomeSalary)
}