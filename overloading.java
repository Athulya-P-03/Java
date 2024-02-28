class MyClass{
	int a;
	float b;
	void display(int a){
		this.a=a;
		System.out.println("The value of a is "+a);
	}
	void display(int a,float b){
		this.a=a;
		this.b=b;
		System.out.println("The value of a and b is "+ a + "and" + b);
	}
}
public class MainClass{
	public static void main(String args[]){
		MyClass obj=new MyClass();
		obj.display(100);
		obj.display(100,123.5f);
	}
}
