public class EncapsulationTwo {
    private String id;
    public void setValue(String a){
        id = a;
    }
    public String getValue(){
        return id;
    }
    static class A{
        public static void main(String[] args) {


        EncapsulationTwo e = new EncapsulationTwo();
        e.setValue("sayam");
            System.out.println(e.getValue());
    }
}}
