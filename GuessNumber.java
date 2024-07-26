import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra= new Random();
        int randomNumber = ra.nextInt(100) + 1;

        System.out.println("Guess the number (between 1 and 100):");

        int userGuess;
        boolean guess = false;

        while (!guess) {
     
            userGuess = sc.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("You guessed the number correct!!");
                guess = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again:");
            } else {
                System.out.println("Too high, try again:");
            }
        }
        sc.close();
    }
}