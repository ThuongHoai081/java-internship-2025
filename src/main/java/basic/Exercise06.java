package basic;

/**
 * Exercise: Write a program that takes an integer input from 1 to 12
 * and outputs the corresponding month name.
 * If the input number is not between 1 and 12, print an error message.
 */
public class Exercise06 {
    private static final String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public String getMonthName(int month) {
        if (month < 1 || month > 12) {
            return "Error: Invalid month number";
        }
        return months[month - 1];
    }
}
