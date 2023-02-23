import java.util.Scanner;

class Vowels {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length");
    int n = sc.nextInt();
    char a[] = new char[n];
    System.out.println("enter the array values");
    for (int i = 0; i < n; i++) {
      a[i] = sc.next().charAt(0);
    }
    System.out.println("the vowels are:-");
    for (int i = 0; i < n; i++)
      switch (a[i]) {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          System.out.println(a[i]);
      }
  }
}
