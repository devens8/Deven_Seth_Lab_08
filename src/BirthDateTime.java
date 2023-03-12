import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        //declare driver variables
        Scanner input = new Scanner(System.in);
        int dayHi = 0;
        //uses getRangedInt method to store each time value
        int year = SafeInput.getRangedInt(input, "Please enter your birth year", 1950, 2010);
        int month = SafeInput.getRangedInt(input, "Please enter your birth month", 1, 12);

        //uses inputted month to determine the number of days, based off 3 cases
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                dayHi = 31;
            break;

            case 4, 6, 9, 11:
                dayHi = 30;
            break;

            case 2:
                dayHi = 29;
            break;
        }
        
        int day = SafeInput.getRangedInt(input, "Please enter your birth day", 1, dayHi);
        int hours = SafeInput.getRangedInt(input, "Please enter your birth hour", 1, 24);
        int minutes = SafeInput.getRangedInt(input, "Please enter your birth minute", 1, 59);

    }
}
