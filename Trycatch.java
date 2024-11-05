import java.io.*;
class Trycatch
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
catch(Exception e)
{
System.out.println("Exception caught");
}
}
}
