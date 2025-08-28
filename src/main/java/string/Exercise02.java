package string;

/**
 * Exercise02:Calculate the sum of integers in the string.
 * For example abc 123 def 33 mn 3.221 will give 380 where 380 = 123+33+3+221.
 */
public class Exercise02 {
    public long sumOfIntegersInString(String str) {

        if (str == null || str.isEmpty()) {
            return 0L;
        }

        long sum = 0;
        int num = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                numStr.append(ch);
            }

            if (!Character.isDigit(ch) && !numStr.isEmpty()) {
                sum += Long.parseLong(numStr.toString());
                numStr.setLength(0);
            }
        }

        if (!numStr.isEmpty()) {
            sum += Long.parseLong(numStr.toString());
        }

        return sum;
    }
}
