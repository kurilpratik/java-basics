import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Basic while loop
        System.out.println("Count to 5:");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Sum of digits using while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10; // Get last digit
            sum += digit;
            temp /= 10; // Remove last digit
        }
        System.out.println("Sum of digits of " + num + " = " + sum);

        sc.close();
    }    
}
