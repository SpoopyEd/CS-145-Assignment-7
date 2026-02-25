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
        Fraction sum = new Fraction();
        sum = addFraction(fraction1, fraction2);
        System.out.println(fraction1.toString() + " + " + fraction2.toString());
        System.out.println("Sum: " + sum.toString());
    }
    public static int leastCommon(int d1, int d2) {
        int lcd = 0; // least common denominator
        int largest = 0; // largest number
        int smallest = 0; // smallest number
        if (d1 == d2) { // if they are the same denominator than no need to find lcd
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
                return leastCommon(d1 * d2, d2); // recursion
            }
        }
    }
    public static Fraction prompt(int fractionNumber) {
        boolean tryLoop = true;
        int n = 0; // numerator
        int d = 0; // denominator
        System.out.println("What's the numerator for fraction " + fractionNumber + "?");
        while (tryLoop == true) { // keep trying until succesful, just like life
            try {
                n = input.nextInt();
                tryLoop = false;
            } catch (Exception e) {
                System.out.println("Thats not a digit, try again");
            } finally {
                input.nextLine(); // clears input
            }
        }
        tryLoop = true;
        System.out.println("What's the denominator for fraction " + fractionNumber + "?");
        while (tryLoop == true) { // keep trying until succesful, just like life
            try {
                d = input.nextInt();
                tryLoop = false;
            } catch (Exception e) {
                System.out.println("Thats not a digit, try again");
            } finally {
                input.nextLine(); // clears input
            }
        }
        Fraction fraction = new Fraction(n,d);
        System.out.println("Fraction " + fractionNumber + ": " + fraction.toString());
        return fraction;
    }
    public static Fraction addFraction(Fraction fraction1, Fraction fraction2) {
        int lcd = leastCommon(fraction1.d, fraction2.d);
        fraction1.changeDenom(lcd);
        fraction2.changeDenom(lcd);
        int sumN = fraction1.n + fraction2.n;
        Fraction sum = new Fraction(sumN, lcd);
        return sum;
    }
}
