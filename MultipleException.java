import java.io.*;
class MultipleException{
public static void main(String[] args)
{
int a=5;
int b=0;
int c;
int arr[]=new int[5];
try{
String str=null;
c=a/b;
arr[10]=200;
System.out.println("the length of the string is:"+str.length());
}
catch(NullPointerException np)
{
System.out.println("Nullpointer exception");
}
catch(ArithmeticException ae)
{
System.out.println("ArithmeticException caught");
}
catch(ArrayIndexOutOfBoundsException ai)
{
System.out.println("Arrayindexoutofbounds Exception caught");
}
catch(Exception e)
{
System.out.println("Exception caught");
}
}
}
