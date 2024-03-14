class product{
    int pcode;
    String pname;
    double price;
    
    product(int pcode,String pname,double price){
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
}
class Main{
    public static void main(String[] args){
        product product1=new product(001,"p1",10000.00);
        product product2=new product(002,"p2",50000.00);
        product product3=new product(003,"p3",39000.00);
        
        product CheapestProduct;
        if(product1.price<product2.price && product1.price<product3.price){
            CheapestProduct=product1;
        }
        else if(product2.price<product1.price && product2.price<product3.price){
            CheapestProduct=product2;
        }
        else{
            CheapestProduct=product3;
            
        }
        System.out.println("The cheapest product is : "+CheapestProduct.pname+" with price $"+CheapestProduct.price);
    }
}
