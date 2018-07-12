import java.io.*;
import java.util.*;
class Bitonic
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++)
{
if(a[i]<a[i+1])
{
System.out.print(a[i]);
break;
}
}
}
}
