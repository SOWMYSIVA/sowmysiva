import java.io.*;
import java.util.*;
class Longprefix
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s[]=new String[n];
String s1="";
String s2="";
for(int i=0;i<s.length;i++)
{s[i]=sc.next();
}
for(int i=0;i<s.length-1;i++)
{
for(int j=0;j<s[i].length();j++)
{
    if(String.valueOf(s[i].charAt(j)).equalsIgnoreCase(String.valueOf(s[i+1].charAt(j))))
     s1=s1+String.valueOf(s[i].charAt(j));
     else
     break;
     }}
     for(int i=0;i<s1.length();i++)
     {
     String m=String.valueOf(s1.charAt(i));
     if(!s2.contains(m))
     s2=s2+m;
     }
     System.out.println(s2);
     }}
