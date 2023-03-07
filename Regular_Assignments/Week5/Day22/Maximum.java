import java.util.StringTokenizer;

class Maximum {
  public static void main(String args[]) {
    StringTokenizer str = new StringTokenizer("come to bitlabs and get ready job");
    int maxLength = 0;
    while (str.hasMoreTokens()) {
      String token = str.nextToken();
      int length = token.length();
      if (length > maxLength) {
        maxLength = length;
      }
    }
    System.out.println("Maximum length of token is:-" + maxLength);
  }
}