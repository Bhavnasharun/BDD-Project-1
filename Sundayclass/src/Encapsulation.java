public class Encapsulation{
   private int employ;
   public void setEmploy(int emp){
      employ=emp;
   }public int getEmploy() {
      return employ;
   }
}
class Complny{
   public static void main(String[] args) {


   Encapsulation e = new Encapsulation();
   e.setEmploy(200);
      System.out.println(e.getEmploy());
}}




