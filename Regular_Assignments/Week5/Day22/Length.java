import java.util.StringTokenizer;

class Length{
  public static void main(String args[]){
   StringTokenizer str=new StringTokenizer(" welcome to bitlabs");
    System.out.println("length of the token is");
    while(str.hasMoreTokens()){
      System.out.println(str.nextToken().length());
    }
  }
}