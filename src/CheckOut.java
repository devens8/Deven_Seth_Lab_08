import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        //declare variables
        double totalCost = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the $10 store!");
        //do while loop - loops until user enters 'n,' and adds to the total cost when new item entered
        do {
            totalCost += SafeInput.getRangedDouble(input, "Please enter the cost of the item you are purchasing ", .50, 9.99);
        } while(SafeInput.getYNConfirm(input, "Do you have any more Items? Enter [Y/N]"));

        System.out.println("Your total cost is $" + totalCost);
    }
}
