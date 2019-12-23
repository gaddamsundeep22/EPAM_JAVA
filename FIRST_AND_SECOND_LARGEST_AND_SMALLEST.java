import java.util.*;
import java.io.*; 
 class Array5
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
        System.out.println("first smallest element is \n"+arr[0]);
         System.out.println("second smallest element is \n"+arr[1]);
         System.out.println("first largest element is \n"+arr[n-1]);
         System.out.println("second largest element is \n"+arr[n-2]);
} 
}