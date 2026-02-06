import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Simple if-else
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Nested if-else: Check even/odd for +ve numbers
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }

        // Ternary Operator (Shorthand)
        String result = (num >= 0) ? "Non-negative" : "Negative";
        System.out.println("Result: " + result);

        sc.close();
    }

}
