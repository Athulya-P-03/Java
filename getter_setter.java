public class SimpleClass{
private int Num;
//getter method to retrieve the value of num
int getNum(){
	return Num;
}
//setter method two retrieve of num
void setNum(int newValue){
	Num=newValue;
}
//main method for testing the class
public static void main(String args[]){
	SimpleClass myObject=new SimpleClass();
	myObject.setNum(100);
	//retrieve the value using the getter and print it
	System.out.println("The value of num is :"+myObject.getNum());
	}
}
	
