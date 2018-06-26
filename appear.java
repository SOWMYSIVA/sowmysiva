import java.io.*;
import java.util.*;
class appear
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
int count=0;
for(int i=0;i<n;i++)
{
count=0;
for(int j=0;j<n;j++)
{
if(a[i]==a[j])
{
count++;
}
}
if(count==1)
{
System.out.print(a[i]);
break;
}
}
}
}
