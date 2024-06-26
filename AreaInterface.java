import java.util.Scanner;
interface Shape{
    public void getter();
    public void area();
    public void perimeter();
}

class Circle implements Shape{
    double r,a,p;
    Scanner sc=new Scanner(System.in);
    public void getter(){
        System.out.println("Enter the radius of the circle:");
        r=sc.nextDouble();
    }
    public void area(){
        a=3.14*r*r;
        System.out.println(a);
    }
    public void perimeter(){
        p=2*3.14*r;
        System.out.println(p);
    }
}

class Square implements Shape{
    int s,a,p;
    Scanner sc=new Scanner(System.in);
    public void getter(){
        System.out.println("Enter the length of the square:");
        s=sc.nextInt();
    }
    public void area(){
        a=s*s;
        System.out.println(a);
    }
    public void perimeter(){
        p=4*s;
        System.out.println(p);
    }
}

class Triangle implements Shape{
    double a,b,c,h,p,d;
    Scanner sc=new Scanner(System.in);
    public void getter(){
        System.out.println("Enter the base of triangle:");
        b=sc.nextDouble();
        System.out.println("Enter the height of triangle:");
        h=sc.nextDouble();
        System.out.println("Enter the first side of triangle:");
        d=sc.nextDouble();
        System.out.println("Enter the second side of triangle:");
        c=sc.nextDouble();
    }
    public void area(){
        a=0.5*b*h;
        System.out.println(a);
    }
    public void perimeter(){
        p=d+b+c;
        System.out.println(p);
    }
}

class Rectangle implements Shape{
    int l,b,a,p;
    Scanner sc=new Scanner(System.in);
    public void getter(){
        System.out.println("Enter the length of rectangle:");
        l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        b=sc.nextInt();
    }
    public void area(){
        p=2*(l+b);
        System.out.println(p);
    }
    public void perimeter(){
        a=l*b;
        System.out.println(a);
    }
}

public class AreaInterface{
    public static void main(String args[]){
        int wish,ch;
        Scanner sc=new Scanner(System.in);
        Circle cir=new Circle();
        Square sq=new Square();
        Triangle tri=new Triangle();
        Rectangle rect=new Rectangle();
        System.out.println("1.Circle\n2.Square\n3.Triangle\n4.Rectangle");
        do{
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:cir.getter();
                       System.out.println("Area of circle:");
                       cir.area();
                       System.out.println("perimeter of circle:");
                       cir.perimeter();
                       break;
                case 2:sq.getter();
                       System.out.println("Area of Square:");
                       sq.area();
                       System.out.println("Perimeter of square:");
                       sq.perimeter();
                       break;
                case 3:tri.getter();
                       System.out.println("Area of Triangle:");
                       tri.area();
                       System.out.println("Perimeter of Triangle:");
                       tri.perimeter();
                       break;
                case 4:rect.getter();
                       System.out.println("Area of Rectangle:");
                       rect.area();
                       System.out.println("Perimeter of Rectangle:");
                       rect.perimeter();
                       break;
            }System.out.println("Do you wish to continue(1/0):");
            wish=sc.nextInt();
            
        }while(wish==1);
    }
}
