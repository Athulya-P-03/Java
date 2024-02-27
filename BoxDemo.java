class MyBox{
	int l,b,h;
}
class BoxDemo{
	public static void main(String args[]){
		int vol;
		MyBox box=new MyBox();
		box.l=10;
		box.b=5;
		box.h=2;
		vol=box.l*box.h*box.b;
		System.out.println("Volume="+vol);
		}
}
