package school.mjc.stage0.conditions.finalTask;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DaysInMonth {
    public void printDays(int year, int month) {

        switch(month) {
            default :
                System.out.println("invalid date");
                break;
            case 1 :
                System.out.println(31);
                break;
            case 2 :
                boolean isLeap = (year%4 == 0 && year%100 != 0) || year%400 == 0;
                System.out.println(isLeap ? 29 : 28);
                break;
            case 3 :
                System.out.println(31);
                break;
            case 4 :
                System.out.println(30);
                break;
            case 5 :
                System.out.println(31);
                break;
            case 6 :
                System.out.println(30);
                break;
            case 7 :
                System.out.println(31);
                break;
            case 8 :
                System.out.println(31);
                break;
            case 9 :
                System.out.println(30);
                break;
            case 10 :
                System.out.println(31);
                break;
            case 11 :
                System.out.println(30);
                break;
            case 12 :
                System.out.println(31);
                break;

        }
    }
}
