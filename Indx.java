import java.io.*;
import java.util.*;
class Indx
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
count=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(i==a[i])
{
count++;
System.out.print(a[i]);
}
}
if(count==0)
System.out.println("-1");
}
}
