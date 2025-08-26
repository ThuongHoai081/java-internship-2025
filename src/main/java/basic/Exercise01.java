package basic;

/**
 * Exercise01: Find the Greatest Common Divisor (GCD)
 * and Least Common Multiple (LCM) of two natural numbers.
 */
public class Exercise01 {

    // Tim UCLN (Greatest Common Divisor)
    public int findGcd(int a, int b) {
        if (a == 0 || b == 0) return 0;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Tim BCNN (Least Common Multiple)
    public int findLcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a * b) / findGcd(a, b);
    }

}
