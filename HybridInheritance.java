class grandfather{
  void property(){
    System.out.println("property");
  }
}
class father extends grandfather{
  void land(){
    System.out.println("land");
  }
}
class Son extends father{
  void landpaper(){
    System.out.println("landpapers");
  }
}
class daughter extends father{
  void house(){
    System.out.println("house");
  }
}
class HybridInheritance{
  public static void main(String args[]){
    Son s=new Son();
   s.landpaper();
    s.land();
    s.property();
  }
}