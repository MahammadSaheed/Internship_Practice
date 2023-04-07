import java.io.FileWriter;

class FileDemo{
  public static void main(String args[]){
    try{
      FileWriter fw=new FileWriter("adc.txt");
      fw.write("hy how are you");
      fw.close();
    }
    catch (Exception e){
      System.out.println(e);
    }
  }
}