// Eduardo Aguilera
// Cs145
// 2/24/26
// Assignment 7 calculate least common denominator to add 2 fractions using recursion
// Main class
import java.util.Scanner;
public class Assignment7 {
    public static Scanner input = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {
        Fraction fraction1 = prompt(1);
        Fraction fraction2 = prompt(2);
        System.out.println(leastCommon(fraction1.d, fraction2.d));
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
    public static Fraction prompt(int fractionNum) {
        System.out.println("What's the numerator for fraction " + fractionNum + "?");
        int n = input.nextInt();
        // catch non int
        input.nextLine(); // clears input
        System.out.println("What's the denominator for fraction " + fractionNum + "?");
        int d = input.nextInt();
        // catch non int
        input.nextLine(); // clears input
        System.out.println("Fraction" + fractionNum + ": " + n + "/" + d);
        Fraction fraction = new Fraction(n,d);
        return fraction;
    }
}
