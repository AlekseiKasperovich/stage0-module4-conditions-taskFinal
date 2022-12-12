package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int days;
        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                days = 31;
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                days = 30;
                break;
            case (2):
                days = 28;
                break;
            default:
                days = 0;
                break;
        }
        boolean leap = false;
        if (year % 4 == 0) {
            leap = true;
            if (year % 100 == 0 && year % 400 != 0) {
                leap = false;
            }
        }
        if (leap && month == 2) {
            days = 29;
        }
        if (days == 0) {
            System.out.println("invalid date");
        } else {
            System.out.println(days);
        }
    }
}
