package string;

public class Exercise01 {
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (right > left) {
            char a = str.charAt(left);
            char b = str.charAt(right);

            if (a >= 'A' && a <= 'Z') {
                a = (char) (a + 32);
            }

            if (b >= 'A' && b <= 'Z') {
                b = (char) (b + 32);
            }

            if (!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
                left++;
                continue;
            }

            if (!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
                right--;
                continue;
            }

            if (a != b) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
