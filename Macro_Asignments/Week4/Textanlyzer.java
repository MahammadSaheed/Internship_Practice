import java.util.*;

class TextAnlyzer {
  static void analyzer(String text) {
    int Lcount = 1;
    int Charcount = text.length();
    String[] words = text.split("\\s+");
    int Wordcount = words.length;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == '\n') {
        Lcount++;
      }
    }
    System.out.println("Number of character: " + Charcount);
    System.out.println("Number of Lines :" + Lcount);
    System.out.println("Number of words :" + Wordcount);
  }

  public static void main(String args[]) {
    System.out.println("enter the input sentence");
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    analyzer(text);
  }

}