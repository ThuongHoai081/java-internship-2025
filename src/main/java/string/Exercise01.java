package string;

import static java.lang.Character.toUpperCase;

public class Exercise01 {
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (right > left) {
            char a = str.charAt(left);
            char b = str.charAt(right);

            if (toUpperCase(a) != toUpperCase(b)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
