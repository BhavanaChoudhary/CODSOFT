import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        boolean playAgain=true;
        while(playAgain) {
            System.out.println("WELCOME TO THE NUMBER GAME.\nYOU HAVE TO GUESS THE NUMBER BETWEEN 1 TO 100.\nYOUR SCORES WILL BE BASED ON HOW MANY ATTEMPTS YOU TAKE TO GUESS.\nALL THE BEST!!");
            int numberToGuess = random.nextInt(100) + 1;
            boolean GuessedRight = false;
            int number_of_attempts = 0;
            while (!GuessedRight) {
                System.out.println("***GUESS THE NUMBER***\n");
                int userGuess = sc.nextInt();
                number_of_attempts++;
                if (userGuess == numberToGuess) {
                    System.out.println("HURRAYYYY!!!  YOUR GUESS IS ABSOLUTELY CORRECT");
                    GuessedRight=true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too Low. Try Again");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too High. Try Again");
                }
            }
            System.out.println("Number of attempts : " + number_of_attempts);

            if(number_of_attempts<=5){
                System.out.println("Excellent! You are Top Performer\nYour score is: A+");
            }
            else if(number_of_attempts>5 && number_of_attempts<=8){
                System.out.println("You did a good job!\nYour score is: A");
            }
            else if(number_of_attempts>8 && number_of_attempts<=10){
                System.out.println("Good! Try for Improvement\nYour score is: B+");
            }else{
                System.out.println("Better Luck Next Time!\nYour score is: C");
            }
            System.out.println("I HOPE YOU HAD FUN.\nDO YOU WANT TO PLAY AGAIN(yes/no)");
            playAgain = sc.next().equalsIgnoreCase("yes");
            System.out.println("***THANK YOU***");
        }
    }
}