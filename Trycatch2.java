import java.io.*;
class Trycatch2
{
public static void main(String[] args)
{
int a=5;
int b=0;
int c;
try{
c=a/b;
System.out.println("Value of c is"+c);
}
catch(ArithmeticException ae)
{
System.out.println("Arithmetic exception"+ae);
}
}
}
