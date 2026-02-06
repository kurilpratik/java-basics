public class ArrayBasics {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] arr1 = new int[5]; // Array of size 5, default values are 0
        int[] arr2 = {10, 20, 30, 40, 50}; // Direct Initialization

        // Accessing elemets - 0 indexed
        System.out.println("First element: " + arr2[0]);
        System.out.println("Third element: " + arr2[2]);

        // Modifying elements
        arr2[1] = 25;
        System.out.println("Modified second element: " + arr2[1]);

        // Array length
        System.err.println("Array length = " + arr2.length);

        // Traversal usng for loop
        System.out.println("\nArray elements:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // Enhanced for loop
        System.out.println("\nUsing for-each:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }    
}
