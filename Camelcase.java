import java.io.*;
import java.util.*;
class Camelcase
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1[]=s.split(" ");
String s2="";
for(int i=0;i<s1.length;i++)
{
String m=String.valueOf(s1[i].charAt(0));
s2=s2+m.toUpperCase()+s1[i].substring(1,s1[i].length())+" ";   
}
System.out.print(s2);
}
}
