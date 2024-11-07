import java.io.*;
class StringDemo1
{
public static void main(String[] args)
{
String s1="welcome";
String s2=new String("welcome");
String s3="wel";
boolean x=s1.equals(s2);
System.out.println("s1 and s2 are equlas:"+x);
boolean y=s1.equals(s3);
System.out.println("s1 and s3 are equal:"+y);
//System.out.println("The character at 4 position in s3 is:"+s3.charAt(4));
System.out.println("the character at 4 position in s1 is:"+s1.charAt(4));
System.out.println("length of s1 is:"+s1.length());
System.out.println("s1 in uppercase is:"+s1.toUpperCase());
System.out.println("s1 in lowercase is:"+s1.toLowerCase());
System.out.println("the sub string of 2,5 in s1 is:"+s1.substring(2,5));
System.out.println("the index of c is s2 is:"+s2.indexOf('c'));
System.out.println("after concating s1 and s2 is:"+s1.concat(s3));
System.out.println("after concate of s3 and s1 is:"+s3.concat(s1));
System.out.println("s1 contains s3 is:"+s1.contains(s3));
System.out.println("s3 contains s1 is:"+s3.contains(s1));
}
}


 