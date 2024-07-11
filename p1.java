public class p1 {
   int j=10;
  
  static 
    {
        System.out.println("sib-superclass");
    }
}
class p2 extends p1
{
    static 
    {
        System.out.println("sib-subclass");
    }
}
class z1
{
    static 
    {
        System.out.println("amol shet");
    }
    public static void main(String[] args) {
        System.out.println("hello world");
        p2 ref =new p2();
        System.out.println(ref.j);
    }
}
