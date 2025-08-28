package string;

/**
 * Exercise05: Reverse exercise 4, for example, accept ab13c and return abbbbbbbbbbbbbbbc
 */
public class Exercise05 {
    public String expandString(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);
            i++;

            int num = 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                num = num * 10 + Character.getNumericValue(str.charAt(i));
                i++;
            }

            int count = 1;
            if (num > 0) {
                count = num;
            }

            result.append(String.valueOf(ch).repeat(count));
        }

        return result.toString();
    }
}
