import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number (1-7): ");
        int day = sc.nextInt();

        // Traditional Switch
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // Switch with multiple cases
        System.out.println("\nEnter a character: ");
        char ch = sc.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + "is a vowel");
                break;
            default:
                System.out.println(ch + "is a consonant");
        }

        sc.close();
    }    
}
