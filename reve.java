import java.io.*;
import java.util.*;
class reve
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1[]=s.split(" ");
String s2="";
for(int i=0;i<s1.length;i++)
{
String v=s1[i];
s2="";
for(int j=v.length()-1;j>=0;j--)
{
s2=s2+String.valueOf(v.charAt(j));
}
if(i<s1.length)
System.out.print(s2+" ");
else
System.out.print(s2);
}
}
}
