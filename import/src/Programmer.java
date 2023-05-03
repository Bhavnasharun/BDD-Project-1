import java.util.Scanner;

public class Programmer {
    Scanner scanner = new  Scanner(System.in);
    public void eligibleForVote() { //acowledge the user what to enter
        System.out.println("please enter your age in into value");
        //storing age in variable using scanner object


        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible for vote you age is : " + age);
        } else {
            System.out.println("You are not eligible for vote as you age is :" + age);

        }
    }
            public static void main(String[] args) {
        //creating class object to call not-static method in static area
                Programmer programmer = new Programmer();
                programmer.eligibleForVote();
        }



    }




