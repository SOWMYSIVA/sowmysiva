import java.io.*;
import java.util.*;
class Maxsum
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{a[i]=sc.nextInt();
}
Arrays.sort(a);
int sum=0;
for(int j=0;j<a.length;j++)
{
sum=sum+a[j];
}
System.out.println(sum);
}
}
