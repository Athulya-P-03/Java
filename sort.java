import java.util.Arrays;
import java.util.Scanner;
public class Sort{
public static void main(String args[]){
int n1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
n1=sc.nextInt();
System.out.println("Enter values:");
String[] arr=new String[n1];
for(int i=0;i<n1;i++){
arr[i]=sc.next();
}
System.out.println("Sorted array:");
Arrays.sort(arr);
for(int i=0;i<n1;i++){
System.out.println(arr[i]+",");
}
}
}
