import java.io.*;
class Trycatch2
{
public static void main(String[] args)
{
try{
throw new IOException;
}
catch(IOException ae)
{
System.out.println("IOexception caught");
}
}
}

