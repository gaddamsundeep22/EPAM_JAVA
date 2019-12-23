import java.util.*;
import java.io.*;
class Array1{
public static void main(String[] args)throws IOException
{
   
  Scanner sc=new Scanner(System.in);
  int i,n;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<a.length;i++)
a[i]=sc.nextInt();
int sum=0;
float avg=0;
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
avg=sum/a.length;
}

System.out.println("sum is"+sum);
System.out.println("average is"+avg);
}
}