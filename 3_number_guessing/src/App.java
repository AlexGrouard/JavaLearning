import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please guess a number between 0 and 100: ");
        Random rand = new Random();
        String input = scan.nextLine();
        int nbr = Integer.parseInt(input);
        int win = rand.nextInt(100);
        int guessLeft = 10;

        while (guessLeft > 0) {
            if (nbr < win) {
                guessLeft--;
                System.out.println("Too low! You have " + guessLeft + " try left");
                if (guessLeft > 0) {
                    input = scan.nextLine();
                    nbr = Integer.parseInt(input);
                } else {
                    break;
                }
            }
            if (nbr > win) {
                guessLeft--;
                System.out.println("Too high! You have " + guessLeft + " try left");
                if (guessLeft > 0) {
                    input = scan.nextLine();
                    nbr = Integer.parseInt(input);
                } else {
                    break;
                }
            }
            if (nbr == win) {
                System.out.println("You Win! You still had " + guessLeft + " try left");
                break;
            }
        }
        if (guessLeft == 0) {
            System.out.println("You lost!");
            System.out.println("The right number was: " + win);
        }
        scan.close();
    }
}
