import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class MapDemo {
  public static void main(String args[]) {
    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
    // public static void main(String args[]) {
    // LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
    // map.put(7, "shaiduu");
    // map.put(10, "shaidu");
    // System.out.println(map);
    // for (Map.Entry m : map.entrySet()) {
    // System.out.println(m.getKey() + " " + m.getValue());
    // }
    map.put(7, 1900);
    map.put(10, 1200);
    if (map.containsValue(10)) {
      System.out.println("found");
    } else {
      System.out.println("not found");
    }
  }
}












// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.Map;
// import java.util.Scanner;
 
// class Student{
//   int rollno;
//   String name;
//   Student(int rollno,String name){
//     this.rollno=rollno;
//     this.name=name;
//   }
// }
// class MapDemo{
//   public static void main(String args[]){
//     LinkedHashMap<Integer,Student> map=new LinkedHashMap<Integer,Student>();
//     Scanner sc=new Scanner(System.in);
//     for(int i=1;i<=3;i++){
//       map.put(i,new Student(sc.nextInt(),sc.next()));
//     }
 
//     for(Map.Entry m:map.entrySet()){
//       Student st=(Student)m.getValue(); 
//       System.out.println("key is "+m.getKey()+"value is "+m.getValue());
//       System.out.println("values are");
//       System.out.println(st.rollno+" "+st.name);
      
//     }
//   }
// }
 













