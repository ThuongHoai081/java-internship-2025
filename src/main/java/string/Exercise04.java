package string;

/**
 * Take a string containing only letters (a-z, A-Z).
 * Shorten the string by writing the number of repetitions in places where a letter is repeated.
 * For example, abcccceeeeeefd will be written as abc4e6fd, abbbbbbbbbbbbbc will be written as ab13c
 */
public class Exercise04 {
    public String shortenString(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        char currentChar = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            char ch = arr[i];

            if (ch == currentChar) {
                count++;
            } else {
                result.append(currentChar);
                if (count > 1) result.append(count);
                currentChar = ch;
                count = 1;
            }
        }

        result.append(currentChar);
        if (count > 1) result.append(count);

        return result.toString();
    }
}
