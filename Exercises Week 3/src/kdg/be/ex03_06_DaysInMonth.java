package kdg.be;
import java.util.Scanner;
public class ex03_06_DaysInMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        int month = keyboard.nextInt();
        // What IDE recommended: (What I did under which also works)
        String result = switch (month) {
            case 1 -> "January has 31 days";
            case 2 -> "February has 28 days";
            case 3 -> "March has 31 days";
            case 4 -> "April has 30 days";
            case 5 -> "May has 31 days";
            case 6 -> "June has 30 days";
            case 7 -> "July has 31 days";
            case 8 -> "August has 30 days";
            case 9 -> "September has 31 days";
            case 10 -> "October has 30 days";
            case 11 -> "November has 31 days";
            case 12 -> "December has 30 days";
            default -> "Month non-existen";
        };
        System.out.println(result);
    }
}



/* What I did:
        String result = "";
        switch (month) {
            case 1: result = "January has 31 days"; break;
            case 2: result = "February has 28 days"; break;
            case 3: result = "March has 31 days"; break;
            case 4: result = "April has 30 days"; break;
            case 5: result = "May has 31 days"; break;
            case 6: result = "June has 30 days"; break;
            case 7: result = "July has 31 days"; break;
            case 8: result = "August has 30 days"; break;
            case 9: result = "September has 31 days"; break;
            case 10: result = "October has 30 days"; break;
            case 11: result = "November has 31 days"; break;
            case 12: result = "December has 30 days"; break;
            default: result = "Month non-existen"; break;
        }
*/