class Product{
  int pid;
  float price;
  Product(int pid, float price){
    this.pid=pid;
    this.price=price;
  }
  double calculateDiscount(){
    return 0.0;
  }
}
class Electronics extends Product{
  double purchaseAmt;
  Electronics(int pid,float price,double purchaseAmt){
    super(pid,price);
    this.purchaseAmt=purchaseAmt;   
    
  }
   double calculateDiscount(){
    if(purchaseAmt>20000){
      return purchaseAmt*0.5;
    }
     else{
       return purchaseAmt*0.1;
     }
  }
  
}
class Apparels extends Product{
  String season;
  Apparels(int pid,float price,String season){
    super(pid,price);
    this.season=season;
  }
  double calculateDiscount(){
    if(season.equals("winter")){
      return price*0.5;
    }
    else{
      return price*0.1;
    }
  }
}
class Shopping{
  public static void main(String args[]){
    Apparels app=new Apparels(12,3456,"winter");
    double result=app.calculateDiscount();
    System.out.println(result);
  }
}