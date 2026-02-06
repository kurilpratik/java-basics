public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening) = Automatic
        int numInt = 100;
        long numLong = numInt; // int to long
        double numDouble = numLong; // long to double

        System.out.println("Int: " + numInt);
        System.out.println("Long: " + numLong);
        System.out.println("Double: " + numDouble);

        // Explicit Casting (Narrowing) = Manual
        double pi = 3.14159;
        int piInt = (int)pi; // Loses deciaml part
        System.out.println("Casted to int: " + piInt);

        // Be careful with overflow
        int largeNum = 130;
        byte smallNum = (byte)largeNum; // byte range: -128 to 127
        System.out.println("\nLarge int: " + largeNum);
        System.out.println("As byte: " + smallNum); // Overflow!

        /*
        Why -126?

        130 = 1000 0010
        sign bit (leftmost) = 1 -> Signed
        0 -> Positive and 1 -> Negative

        Take 2s complement
        0111 1101 = 126
        But negatively signed
        So -126
        */
    }
}
