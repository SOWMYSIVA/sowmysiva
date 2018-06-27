import java.io.*;
import java.util.*;
class numrev
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=String.valueOf(n);
for(int i=s.length()-1;i>=0;i--)
{
System.out.print(s.charAt(i));
}
}
}
