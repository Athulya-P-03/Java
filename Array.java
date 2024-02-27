import java.util.*;
class array{
	public static void main(String args[]){
		int n,temp=0,i,j;
		System.out.println("Enter the no.of elements:");
		Scanner inp=new Scanner(System.in);
		n=inp.nextInt();
		int arr[]=new int[20];
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=inp.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array in ascending order is:");
		for(i=0;i<n-1:i++){
			System.out.print(arr[i]+",");
		}
		}
		}
