package basics.controlFlow;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        switchCaseConditional();
    }

    public static void switchCaseConditional() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12 to get the corresponding month");

        int numOfMonth = sc.nextInt();
        String month = getNameOfMonth(numOfMonth);
        System.out.println("The Month is : " + month);
    }

    public static String getNameOfMonth(int numOfMonth){
        String month; // if we dont initialize, At Worst case scenario variable does not have any value.

        switch (numOfMonth) {
            case 1:
                month = "january";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Not a valid month"; // When we use default, we may opted out for string initialization at the beginning
        }
        return month;
    }
}
