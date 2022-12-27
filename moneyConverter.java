import java.util.Scanner;

public class moneyCounverter {
  
    public static void main(String[] args) {

        int dollar, cents, total;

        Scanner coins = new Scanner(System.in);

        System.out.print("Enter the total monetary value in your pocket: ");
        total = coins.nextInt();

        dollar = total / 100;
        cents = total % 100;

        System.out.println("You have " + dollar + " dollar(s) and " + cents + " cent(s).");

    }
}
