class MathFunction{
  int max(int a ,int b){
    if(a>b)
return a;
 else
return b;
  }
  double max(double a,double b){
    if(a>b)
return a;
    else
      return b;
  }
  int max(int a ,int b,int c){
if(a>b&& a>c)
return a ;
else if(b>c&&b>a)
return b;
    else
      return c;
  }
}
class Maths{
  public static void main(String args[]){
    MathFunction m=new MathFunction();
    m.max(10,20);
    m.max(11.25,34.56);
    m.max(11,23,45);
  }
}




