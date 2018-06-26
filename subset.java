import java.io.*;
import java.util.*;
class subset
{
public static void main(String arg[])
{
scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int a[]=new int[n];
int b[]=new int[m];
String b1="";
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int j=0;j<m;j++)
{
b[j]=sc.nextInt();
}
for(int i=0;i<m;i++)
{
if(!b1.contains(String.valueOf(b[i])))
{b1=b1+String.valueOf(b[i]);
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
int x=Character.getNumericValue(b1.charAt(i));
if(x==a[j])
count++;
}
}
if(count==b1.length())
System.out.println("Yes");
else
System.out.println("No");
}
}
