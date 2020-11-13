package leapYear;

import java.util.Scanner;


public class main {

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        int year = 0;
        do {
            System.out.print("Enter a year greater than or equal to 1582: ");
            if (sc.hasNextInt())
                year = sc.nextInt();
            else
                sc.nextLine();
        } while (year < 1582);

        if (isLeapYear(year))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 ) && ((year % 100 != 0) || (year % 400 == 0));
    }


}
