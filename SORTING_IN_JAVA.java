import java.util.*;
import java.io.*; 
 class Array6
{ 
    public static void main(String[] args) 
    { 
        int i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int arr[]=new int[n];
        for(i=0;i<n;i++){
       arr[i] = sc.nextInt(); 
}
  for(i=0;i<n;i++){
        Arrays.sort(arr); 
  }     
for(i=0;i<n;i++)   
        System.out.println("elements in sorted fashio are \n"+arr[i]);
} 
}