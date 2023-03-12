import java.util.*;

public class FavNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //set up scanner

        System.out.println(SafeInput.getInt(input, "Please enter your favorite integer"));

        System.out.println(SafeInput.getDouble(input, "Please enter your favorite decimal number"));
    }
}
