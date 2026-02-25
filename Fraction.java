// Eduardo Aguilera
// Cs145
// 2/24/26
// Assignment 7 calculate least common denominator to add 2 fractions using recursion
// Fraction class, creates fraction object with numerator and denominator
public class Fraction {
    int n; // numerator
    int d; // denonimantor
    public Fraction() { // constructs empty fraction
    }
    public Fraction(int n, int d) { // constructs fraction using paramaters
        this.n = n;
        this.d = d;
    }
    public void changeDenom(int lcd) { // changes denominator and numerator according to lcd
        int value = 0;
        if (lcd == d) {
            // do nothing
        } else {
            value = lcd / d;
            n *= value;
            d = lcd;
        }
    }
    public String toString() {
        String string = n + "/" + d;
        return string;
    }
}
