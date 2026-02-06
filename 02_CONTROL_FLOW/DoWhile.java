
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // do-while executes at least once
        int choice;
        do { 
            System.out.println("\n--- Menu ---");
            System.out.println("1. Hello");
            System.out.println("2. Goodbye");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello, User!");
                    break;
                case 2:
                    System.out.println("Goodbye, User!");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);

        sc.close();
    }    
}
