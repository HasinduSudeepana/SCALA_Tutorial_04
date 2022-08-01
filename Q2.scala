import scala.io.StdIn.readInt

object Q2
{
    def main(args:Array[String]):Unit=
    {
        print("Enter the number:")
        var number =readInt()

        if(number<=0)
        {
            println(negative(number))
        }
        if(number!=0)
        {
            println(even_odd(number))
        }
    }

    def negative(number:Int):String=number match
    {
        case 0 => "Zero"
        case x if x<0 => "Negative"
    } 

    def even_odd(number:Int):String=(number%2) match
    {
        case 0 => "Even number"
        case _ => "Odd number"
    }
}
