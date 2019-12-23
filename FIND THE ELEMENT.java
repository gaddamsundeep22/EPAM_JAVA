import java.util.*;
import java.io.*;
class Array3{
public static void main(String [] args) throws IOException
{
int n,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
arr[i]=sc.nextInt();
System.out.println("enter the value to search");
int s;
s=sc.nextInt();
for(i=0;i<n;i++){
if(s == arr[i])
System.out.println("the element is found at"+i);
else 
System.out.println("-1");
}
}
}