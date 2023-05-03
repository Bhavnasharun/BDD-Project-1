public class Program2 {// over loading method, same class name, and call in main method
    static void add(){// overloading
        System.out.println("No parameter");
    }
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(String name, String surname){
        System.out.println(name+""+surname);}
    static void main(){//we can do main method over loading
        System.out.println("main");
    }
    static void main(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        //Program2 program2 = new Program2();


        add();
        add(23, 34);
        add("raj","sar");
    }
}
