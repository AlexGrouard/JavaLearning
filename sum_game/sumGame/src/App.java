import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the sum games!");
        System.out.println("Please enter two numbers to sum ");
        
        System.out.println("The first one: ");
        String input1 = scan.nextLine();
        int a = Integer.parseInt(input1);
        System.out.println("The second one: ");
        String input2 = scan.nextLine();
        int b = Integer.parseInt(input2);
        scan.close();

        int sum = a + b;

        System.out.println("Your result is : " + sum);
    }
}
