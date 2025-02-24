import java.util.Scanner;

public class TaskTwo {
    static int randomNumber = (int) ((Math.random() * 10) + 1);
    public static void main(String[] args){
        guessingGame();
    }

    private static void guessingGame(){
        int numberOfGuesses = 1;

        System.out.println("random: " + randomNumber);
        int guess = -1;


        while (numberOfGuesses <= 3 && guess != randomNumber) {
            Scanner input = new Scanner(System.in);
            System.out.println("Guess a number: ");
            guess = input.nextInt();

            if (guess == randomNumber) {
                break;
            }

            if (numberOfGuesses <= 2 ) {
                System.out.println("Try number " + numberOfGuesses + ", guessed number: " + guess);

                if (guess < randomNumber) {
                    System.out.println("The number you guessed is too low.");
                } else {
                    System.out.println("The number you guessed is too high.");
                }
            }
           numberOfGuesses++;
        }

        if (guess == randomNumber) {
            System.out.println("You win! :) The random number was " + randomNumber + ". You guessed it correctly.");
        } else {
            System.out.println("You lose :(. The random number was: " + randomNumber + ".");
        }

    }
}
