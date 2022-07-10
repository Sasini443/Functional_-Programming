def wage(wage_hour: Int): Int = wage_hour*250

def ot(ot_hour: Int): Int =ot_hour*85

def income(h1: Int, h2: Int): Int = wage(h1)+ ot(h2)

def tax(income: Int): Double = income*0.12

def TakeHome(h1: Int, h2: Int): Double = income(h1, h2) - tax(income(h1,h2))

def main(args: Array[String]) = {
    printf("Take Home Salary : Rs %.2f",TakeHome(24,10));
}
