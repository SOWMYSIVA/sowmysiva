import java.io.*;
import java.util.*;
class fact
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=i*fact;
}
  if(n==0)
    System.out.println(0);
  else
System.out.println(fact);
}}
