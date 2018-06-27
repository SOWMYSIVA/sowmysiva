import java.io.*;
import java.util.*;
class primerange
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=sc.nextInt();
int count=0;
for(int i=n;i<=n1;i++)
{
for(int j=2;j<i/2;j++)
{
if((j%2)!=0)
count++;
}
}
System.out.print(count);
}
}
