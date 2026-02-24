// Eduardo Aguilera
// Cs145
// 2/24/26
// Assignment 7 calculate least common denominator to add 2 fractions using recursion
// Manager class, houses methods

// Might not actually keep this cause some say manager classes are unnecessary???
// I'll have to do some more research and review class material before keeping it, 
// in the meantime I'll use main
import java.util.Scanner;
public class Manager {
    public static void prompt() {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What's the numerator for the 1st fraction you'd like to add?");
        int n1 = input.nextInt();
        // catch non int
        input.nextLine(); // clears input
        System.out.println("What's the denominator for the 1st fraction you'd like to add?");
        int d1 = input.nextInt();
        // catch non int
        input.nextLine(); // clears input
        System.out.println("Fraction 1: " + n1 + "/" + d1);
        Fraction fraction1 = new Fraction(n1,d1);
        System.out.println("What's the numerator for the 1st fraction you'd like to add?");
        int n2 = input.nextInt();
        // catch non int
        input.nextLine(); // clears input
        System.out.println("What's the denominator for the 2nd fraction you'd like to add?");
        int d2 = input.nextInt();
        // catch non int
        input.nextLine(); // clears input
        System.out.println("Fraction 2: " + n2 + "/" + d2);
        Fraction fraction2 = new Fraction(n2,d2);
    }
}
