import java.util.Scanner;

public class Switchone
{

    Scanner scanner = new Scanner(System.in);
    // no return type no perameter
    void Switchmont(){
        System.out.println("enter any 1 to 12 numbers");
        int num = scanner.nextInt();


        switch (num){  case 1:
            System.out.println("January");
            break;
            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");

                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
            case 7:
                System.out.println("Jully");
            case 8 :
                System.out.println("August");
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");


        }

        }
        public static void main(String[] args) {
        Switchone switchone = new Switchone();
        switchone.Switchmont();



    }
        }
