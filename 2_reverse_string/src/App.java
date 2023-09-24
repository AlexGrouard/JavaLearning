import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a word or a sentences to reverse: ");
        String input = scan.nextLine();
        scan.close();

        System.out.println("The reverse is : ");
        for (int i = (input.length()); i > 0; i--) {
            System.out.print(input.charAt(i - 1));
        }
    }
}
