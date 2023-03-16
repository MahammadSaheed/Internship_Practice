
//  Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.

interface Product{
  int quantity1=20;
  int quantity2=12;
  int quantity3=34;
  void getName();
  void getPrice();
  void getQuantity();
  void removeProduct();
  void addProduct();
  void getTotalCost();
}
class PointOfSale implements Product{
  public void getName(){
    
  }
  public void getPrice(){
    int product1Price=150;
    int product2Price=350;
    int product3Price=3000;
    int total_price=product1Price+product2Price+product3Price;
    System.out.println("the tota1 price is "+total_price);
  }
  public void getQuantity(){
    int quantity1=40;
    int quantity2=50;
    int quantity3=80;
    int total_qantity=quantity1+quantity2+quantity3;
    System.out.println("the total quantity is "+total_qantity);
  }
  public void removeProduct(){
    int removeP1=quantity1-10;
    int removeP2=quantity2-20;
    int removeP3=quantity3-15;
    int remaining_product=removeP1+removeP2+removeP3;
    System.out.println("remaining products are "+remaining_product);
  }
  public void addProduct(){
    int addP1=quantity1+15;
    int addP2=quantity2+12;
    int addP3=quantity3+13;
    int additional_product=addP1+addP2+addP3;
    System.out.println("after adding products "+additional_product);
  }
  public void getTotalCost(){
    int priceP1=quantity1*2000;
    int priceP2=quantity2*4000;
    int priceP3=quantity3*3000;
    int total_cost=priceP1+priceP2+priceP3;
    System.out.println("total price of product is  "+total_cost);
  }
  
}
class ProductObject{
  public static void main(String args[]){
    Product p=new PointOfSale();
    p.getQuantity();
    p.getPrice();
    p.getTotalCost();
    p.removeProduct();
    p.addProduct();
    
  }
}