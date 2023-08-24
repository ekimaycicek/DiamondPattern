import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = number - 1; i >= 1; i--) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
