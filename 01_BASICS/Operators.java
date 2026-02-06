public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Addition: " + ( a + b));
        System.out.println("Subtraction: " + ( a - b));
        System.out.println("Multiplication: " + ( a * b));
        System.out.println("Division: " + ( a / b));
        System.out.println("Modulus: " + ( a % b));

        // Increment/Decrement
        int x = 5;
        System.out.println("x++: " + x++); // 5 (pre-increment)
        System.out.println("Now: " + x); // 6
        System.out.println("++x: " + ++x); // 7 (Pre-increment)

        // Relational Operators
        System.out.println("10 > 3: " + (10 > 3));
        System.out.println("10 < 3: " + (10 < 3));
        System.out.println("10 == 10: " + (10 == 3));
        System.out.println("10 != 3: " + (10 != 3));

        // Logical Operators
        boolean p = true, q = false;
        System.out.println("p && q: " + (p && q)); // AND: false
        System.out.println("p || q: " + (p || q)); // OR: true
        System.out.println("!p: " + (!p)); // NOT: false
    }
}
