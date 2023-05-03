public class Polymorphism {
    int a ;
    int b;

    public void add (int a, int b){
        System.out.println(a+b);//no return type perameter


    }

    public static void main(String[] args) {

         Polymorphism polymorphism = new Polymorphism();// object without perameter
         polymorphism.add(10, 20);// static ke liye object banaya
    }
}
