import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //set up scanner class

        //Uses getRegExString method to print various outputs

        String SSN = SafeInput.getRegExString(input, "Please enter your SSN number", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println(SSN);

        String UCStudentMNumber = SafeInput.getRegExString(input, "Please enter your M number", "(M|m)\\d{5}");
        System.out.println(UCStudentMNumber);

        String MenuPattern = SafeInput.getRegExString(input, "Please enter one of the menu choices: Open, Save, View, Quit [O, S, V, Q]", "[OoSsVvQq]");
        System.out.println(MenuPattern);
    }
}
