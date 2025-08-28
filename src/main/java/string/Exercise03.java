package string;

/**
 * Exercise03: Write a program to check if a string is repeated any string or not
 */
public class Exercise03 {
    public boolean isRepeatedSubstring(String str) {
        if (str == null || str.length() <= 1) {
            return false;
        }

        String doubled = str + str;
        String trimmed = doubled.substring(1, doubled.length() - 1);

        return trimmed.contains(str);
    }

}
