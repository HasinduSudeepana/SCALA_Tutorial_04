object Q3
{
    def main(args:Array[String]):Unit=
    {
        println(formatNames("Benny")(-1)(toUpper))      //call formatName function and pass theree data types String,Int and pass function again
        println(formatNames("Niroshan")(1)(toUpper))
        println(formatNames("Saman")(-1)(toLower))
        println(formatNames("Kumara")(5)(toUpper))
    }

    def toUpper(name:String):String= //this function is use to convert lower case to upper case
    {
        return name.toUpperCase()
    }

    def toLower(name:String):String=  //this function is use to convert to upper case to lower case
    {
        return name.toLowerCase()
    }

//  aaaaaa  pass name from main    pass the int from main   pass the tolower or toupper function from main
    def formatNames(name:String)(x:Int)(func:String=>String):String=   //this is the function call from main function
    {
        if(x== -1)
        {
            func(name)   //
        }
        else
        {
            var len=name.length()   //use to get the length of the string
            var temp=""    //this is empty string
            var i= 0
            while(i<len)
            {
                if(i==x)
                {
                    temp=temp+func(name.charAt(i).toString)      //charAt()  return the character of the index passed in the argument 
                }                                               //.toString display a string from the scala map
                else            
                {
                    temp=temp+name.charAt(i).toString
                }
                i=i+1
            }
            return temp
        }
    }
}