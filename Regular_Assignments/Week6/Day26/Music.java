class Songs{
 void play(){
    System.out.println("playing audio song");
  }
}
class PopSong extends Songs{
  void play(){
    super.play();
    System.out.println("it plays full of beats");
  }
}
class JazzSong extends Songs{
  void play(){
    System.out.println("it plays full of melody and smooth ");
  }
}
class Music{
  public static void main(String args[]){
    PopSong p=new PopSong();
    JazzSong j=new JazzSong();
    p.play();
    j.play();
  }
}