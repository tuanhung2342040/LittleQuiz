import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int score =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you ready for a quiz?");
        String user = scan.nextLine();
        System.out.println("Okay, here it comes!");
        System.out.println("\n(Q1) What is the capital of Alaska?\n\t\t1) Melbourne\n\t\t2) Anchorage\n\t\t3) Juneau");
        System.out.println(">");
        int answer1 = scan.nextInt();
        if(answer1 == 3){
            System.out.println("That's right");
            score++;
        }
        else{
            System.out.println("Sorry, Juneau is the capital of Alaska");
        }
        System.out.println("\n(Q2) Can you store the value \"cat\" in a variable of int?\n\t\t1) yes\n\t\t2) no");
        System.out.println(">");
        int answer2 = scan.nextInt();
        if(answer2 == 2){
            System.out.println("That's right");
            score++;
        }
        else{
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }
        System.out.println("\n(Q3) What is the result of 9+6/3?\n\t\t1) 5\n\t\t2) 11\n\t\t3) 15/3");
        System.out.println(">");
        int answer3 = scan.nextInt();
        if(answer3 == 2){
            System.out.println("That's correct");
            score++;
        }
        else{
            System.out.println("Sorry, the answer is 11");
        }
        System.out.println("Overall, you got " + score +" out of 3 correct");
        System.out.println("Thanks for playing");
    }
}

