import java.io.*;
import java.util.*;
class close
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int sum=9,sum1=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i!=j)
{
sum1=a[i]+a[j]
}
if(sum1<sum)
{
sum=sum1;
}
}
}
System.out.print(sum);
}
}
