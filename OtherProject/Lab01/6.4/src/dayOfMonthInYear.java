import java.util.Scanner;
import java.util.Arrays;

public class dayOfMonthInYear {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the month:");
        String month = sc.nextLine();

        System.out.println("Enter the year:");
        int year =  sc.nextInt();


        boolean isLeapYear = true;

        if (year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 != 0){
                    isLeapYear = false;
                }
            }
        } else {
            isLeapYear = false;
        }
        if (isLeapYear){
            System.out.println("this is a leaf year!");
        } else {
            System.out.println("not a leaf year!");
        }


        String[] shortenedMonth = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] abbreviation = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.",
                "July.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] fullMonth = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] number = {"1", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "11", "12"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leafDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear){
            for (int i = 0; i < 12; i++){
                if (shortenedMonth[i].equals(month) || abbreviation[i].equals(month) || fullMonth[i].equals(month)
                        || number[i].equals(month)) {
                    System.out.println("The month " + month + " in the year " + year + " has " + leafDays[i] + " days.");
                }
            }
        } else {
            for (int i = 0; i < 12; i++) {
                if (shortenedMonth[i].equals(month) || abbreviation[i].equals(month) || fullMonth[i].equals(month)
                        || number[i].equals(month)) {
                    System.out.println("The month " + month + " in the year " + year + " has " + days[i] + " days.");
                }
            }
        }
    }
}