import java.util.StringTokenizer;

public class Reverse {
  public static void main(String[] args) {        
                 
        StringTokenizer st = new StringTokenizer("cristiano ronaldoooo");         
        String reverse = "";          
        while (st.hasMoreTokens()) {
            reverse = st.nextToken() + " " + reverse;
        }        
        System.out.println("Original string is : " + st);
        System.out.println("Reversed string is : " + reverse);
         
    }
}
