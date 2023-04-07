class RunThread extends Thread{
  public void run(){
  System.out.println("thread is running");
    }
}
class ThreadDemo{
  public static void main(String args[]){
    RunThread t1=new RunThread();
    t1.start();
  }
}


// class RunThread implements Runnable{
//   public void run(){
//     System.out.println("Thread is running");
//   }
// }
// class ThreadDemo{
//   public static void main(String args[]){
//     RunThread t1=new RunThread();
//     Thread thread=new Thread(t1);
//     thread.start();
//   }
// }