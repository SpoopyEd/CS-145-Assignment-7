// Eduardo Aguilera
// Cs145
// 2/24/26
// Assignment 7 calculate least common denominator to add 2 fractions using recursion
// Main class
import java.util.Scanner;
public class Assignment7 {
    public static Scanner input = new Scanner(System.in);  // Create a Scanner object
    public static void main(String[] args) {
        int lcd = 0; // least common denominator
        Fraction fraction1 = prompt(1);
        Fraction fraction2 = prompt(2);
        lcd = leastCommon(fraction1.d, fraction2.d);
        System.out.println(lcd);
        fraction1.changeDenom(lcd);
        System.out.println("Fraction" + ": " + fraction1.n + "/" + fraction1.d);
        // find addition
    }
    public static int leastCommon(int d1, int d2) {
        int lcd = 0; // least common denominator
        int largest = 0; // largest number
        int smallest = 0; // smallest number
        if (d1 == d2) {
            lcd = d1;
            return lcd;
        } else {
            // finds smallest and largest
            if (d1 > d2) { 
                largest = d1;
                smallest = d2;
            } else {
                largest = d2;
                smallest = d1;
            }

            if (largest % smallest == 0) { // if largest divisble by smallest
                lcd = largest; // then lcd is the largest number
                return lcd;
            } else { // if not divisible then multiply both denominators, that becomes the lcd
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
        System.out.println("Fraction " + fractionNum + ": " + n + "/" + d);
        Fraction fraction = new Fraction(n,d);
        return fraction;
    }
    public static Fraction addFraction(Fraction fraction1, Fraction fraction2) {
        Fraction sum = new Fraction();
        return sum;
    }
}
