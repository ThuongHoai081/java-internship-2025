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
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == currentChar) {
                count++;
                continue;
            }

            result.append(currentChar);
            if (count > 1) result.append(count);

            currentChar = ch;
            count = 1;

        }

        result.append(currentChar);
        if (count > 1) result.append(count);

        return result.toString();
    }
}
