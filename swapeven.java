import java.io.*;
import java.util.*;
class swapeven
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String s1="";
int n=0;
if(s.length()%2==0)
n=s.length();
else
n=s.length()-1;
for(int i=0;i<n;i=i+2)
{
s1=s1+String.valueOf(s.charAt(i+1))+String.valueOf(s.charAt(i));
}
if((s.length()%2)!=0)
s1=s1+String.valueOf(s.charAt(s.length()-1));
System.out.print(s1);
}
}
