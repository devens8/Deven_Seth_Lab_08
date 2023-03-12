import java.util.*;

public class DevTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //set up scanner class

        //print tests for library
        System.out.println(SafeInput.getNonZeroLenString(input, "Please enter a string text"));
        System.out.println(SafeInput.getInt(input, "Please enter a integer"));
        System.out.println(SafeInput.getDouble(input, "Please enter a number"));
        System.out.println(SafeInput.getRangedInt(input, "Please enter your birthday", 1, 12));
        System.out.println(SafeInput.getRangedDouble(input, "Please enter your ID ", 1, 12));
        System.out.println(SafeInput.getYNConfirm(input, "Please enter Yes or No [Y/N]"));
        System.out.println(SafeInput.getRegExString(input, "Please enter you SSN", "\\d{3}-\\d{2}-\\d{4}"));

    }
}