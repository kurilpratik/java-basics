public class ForLoop {
    public static void main(String[] args) {

        // Basic for loop
        System.out.println("Numbers 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Reverse loop
        System.out.println("\nReverse countdown from 5:");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Step by 2
        System.out.println("\nEven numbers from 0 to 10:");
        for (int i = 0; i <= 10; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Nested Loops (Pattern)
        System.out.println("\nPattern: ");
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
