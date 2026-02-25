// Eduardo Aguilera
// Cs145
// 2/24/26
// Assignment 7 calculate least common denominator to add 2 fractions using recursion
// Main class
import java.util.Scanner;
public class Assignment7 {
    public static Scanner input = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {
        System.out.println(leastCommon(3,28));
    }
    public static int leastCommon(int d1, int d2) {
        int lcd = 0;
        int largest = 0;
        int smallest = 0;
        if (d1 == d2) {
            lcd = d1;
            return lcd;
        } else {
            if (d1 > d2) { // finds smallest and largest
                largest = d1;
                smallest = d2;
            } else {
                largest = d2;
                smallest = d1;
            }

            if (largest % smallest == 0) {
                lcd = largest;
                return lcd;
            } else { // if largest not divisble by smallest then multiply them = lcd
                return leastCommon(d1 * d2, d2); 
            }
        }
    }
    public static void prompt() { // will need to change later
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
