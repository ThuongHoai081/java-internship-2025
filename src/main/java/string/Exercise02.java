package string;

/**
 * Exercise02:Calculate the sum of integers in the string.
 * For example abc 123 def 33 mn 3.221 will give 380 where 380 = 123+33+3+221.
 */
public class Exercise02 {
    public int sumOfIntegersInString(String str) {

        if (str == null || str.isEmpty()) {
            return 0;
        }

        int sum = 0;
        int num = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + Character.getNumericValue(ch);
            } else {
                sum += num;
                num = 0;
            }
        }

        return sum + num;
    }
}
