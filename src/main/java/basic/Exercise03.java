package basic;

/**
 * Exercise03: Write a program that takes an integer as input and returns its prime factorization.
 * Example: if the input is 600, the output should be "2 * 2 * 2 * 3 * 5 * 5".
 */
public class Exercise03 {
    public String primeFactorization(int number) {
        if (number < 2) {
            return number + " cannot be factorized into prime numbers";
        }

        StringBuilder result = new StringBuilder();
        int n = number;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                if (!result.isEmpty()) {
                    result.append(" * ");
                }
                result.append(i);
                n /= i;
            }
        }

        if (n > 1) {
            if (!result.isEmpty()) {
                result.append(" * ");
            }
            result.append(n);
        }

        return result.toString();
    }
}
