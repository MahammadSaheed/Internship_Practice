import java.util.Scanner;
import java.time.LocalDate; 
class DateParametorizedConstructor{
  String name;
  char gender;
  int age;
  String dob;

  DateParametorizedConstructor(String n,char g,int a){
    name=n;
    gender=g;
    age=a;
  } 
  
  void display(){
    System.out.println("the name of person is "+name);
    System.out.println("the age of "+name+" is "+age);
    System.out.println("the gender of "+name+" is "+gender);
    System.out.println("\n");
  }
  void calculateYearOfBirth(){   
    Scanner sc=new Scanner(System.in);
    int curYear=2023;
    System.out.println("current year:"+curYear);
    int ageUsingYear=curYear-age;
    System.out.println("the person was born in the year : "+ageUsingYear);
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    DateParametorizedConstructor p=new DateParametorizedConstructor("siraj",'m',10);
    p.display();
    p.calculateYearOfBirth();
    }
  }