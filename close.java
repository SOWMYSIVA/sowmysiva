import java.io.*;
import java.util.*;
class close
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int sum=9,sum1=0,x=0,y=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i!=j)
{ sum1=0;
sum1=a[i]+a[j];
 vcif(sum1<sum && sum1>=0)
{
sum=sum1;
x=a[i];
y=a[j];
}
}
}
}
System.out.print(x+" "+y);
}
}

    



