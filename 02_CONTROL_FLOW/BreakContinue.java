public class BreakContinue {
    public static void main(String[] args) {
        // Break: Exits the loop
        System.out.println("Break example (stop at 5):");
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                break; // Exit loop from 1 to 5
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Continue: Skips current iteration
        System.out.println("\nContinue example (skip 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Print only even numbers using continue
        System.out.println("\nEven numbers till 10:");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Skips odd numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }    
}
