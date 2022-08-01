import scala.io.StdIn.readDouble

object Q1 
{
    def main(args:Array[String]):Unit=
    {
        print("enter your deposited amount: Rs ")
        var amount=readDouble()
        println("your interest is: Rs "+interest(amount))
    }

    def interest(amount:Double):Double = amount match
    {
        case x if x<0 => 0;
        case x if x<20000 => x*.02;
        case x if x<200000 => x*.04;
        case x if x<2000000 => x*.35;
        case x if x>=2000000 => x*.65;
    }
}