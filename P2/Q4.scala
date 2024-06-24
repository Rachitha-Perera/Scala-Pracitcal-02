//profit=revenue-cost
//revenue = ticket price * No. of attendees
//cost has two pairs : 1) 500(fixed) 2) 3 per attendee(variable)
object TP{
    def attendees(tp:Int):Int=120+(15-tp)/5*20
    def revenue(tp:Int):Double=attendees(tp)*tp
    def cost(tp:Int):Double=500+3*attendees(tp)
    def profit(tp:Int):Double=revenue(tp)-cost(tp)

    def main(args:Array[String]):Unit={
        var p=profit(30)
        printf("Profit is : "+p);
    }
}