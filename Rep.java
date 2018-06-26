import java.io.*;
import java.util.*;
class Rep
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
String s="";
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
count=0;
for(int j=0;j<n;j++)
{
if(a[i]==a[j]
count++;
}
if(count>1)
b[i]=a[i];
}
Arrays.sort(b);
for(int i=0;i<b.length;i++)
{
System.out.print(b);
}
}
}
