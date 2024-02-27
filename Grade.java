import java.util.*;
class Grade{
	public static void main(String args[]){
	char[][] a={{'D','B','A','B'},
		   {'A','B','C','A'},
		   {'B','B','C','A'},
		   {'D','C','B','A'}};
	char[] k={'D','C','B','A'};
	int i,j,count=0;
	for(i=0;i<4;i++){
		for(j=0;j<4;j++){
			if(a[i][j]==k[j]){
			count=count+1;
			}
		}
	System.out.println("Score of "+(i+1)+" is "+count);
	count=0;
	}
   }
}
