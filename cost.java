import java.io.*;
import java.util.*;
class cost
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String x=sc.next().toUpperCase();
String y=sc.next().toUpperCase();
int count=0;
for(int i=0;i<x.length();i++)
{
if(String.valueOf(x.charAt(i)).equals(String.valueOf(y.charAt(i))))
count++;
}
int v=y.length()-count;
System.out.println(v);
}
}
