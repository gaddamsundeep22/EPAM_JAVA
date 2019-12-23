import java.util.*;
import java.io.*;
class Array2{
public static void main(String[] args)
{
   int a[]=new int[5];
  Scanner sc=new Scanner(System.in);
  int i,n;
n=a.length;
for(i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
int max=0,min=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.println(" maximum="+max);
for(i=0;i<a.length;i++)
{
if(a[i]<min)
min=a[i];
}
System.out.println(" minimum"+min);
}
}