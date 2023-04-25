// Write a program that creates an ArrayList of names (Strings) and allows the user to add and remove names from the list. The program should also allow the user to print out all the names in the list.

import java.util.*;

class ArrayName{
  public static void main(String args[]){
    ArrayList<String> names=new ArrayList<String>();
    Scanner sc=new Scanner(System.in);
    while(true){
      System.out.println("enter your choice");
       System.out.println("add name"); 
       System.out.println("remove name"); 
        System.out.println("print all the name");
       System.out.println("exit");
      int choice =sc.nextInt();
      switch(choice){
        case 1:
          System.out.println("enter the name:-");
          String nameToAdd=sc.next();
          names.add(nameToAdd);
          System.out.println(nameToAdd+"the name is added to list");
          break;
          case 2:
      System.out.print("Enter name to remove: ");
         String nameToRemove = sc.next();
          if (names.remove(nameToRemove)) {
     System.out.println(nameToRemove + " removed from list.");
      } else {
   System.out.println(nameToRemove + " not found in list.");
    }
    break;
        case 3:
      if (names.isEmpty()) {
     System.out.println("List is empty.");
       } else {
          System.out.println("Names in list:");
       for (String name : names) {
        System.out.println(name);
          }
       }
          break;  
           case 4:
         System.out.println("Goodbye!");
           sc.close();
           System.exit(0);
               break;
                default:
       System.out.println("Invalid choice.");
              break;
      }
    }
  }
}