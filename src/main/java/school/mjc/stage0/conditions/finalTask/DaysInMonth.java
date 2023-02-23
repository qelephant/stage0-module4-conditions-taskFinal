package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int daysInMonth;
        int leapYear = year % 400 == 0 || year %4 == 0 && year % 100 != 0 ? 1 : 0;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
               daysInMonth = 30;
                System.out.println(daysInMonth);
            } else if (month == 2) {
                daysInMonth = leapYear == 0 ? 29 : 28;
                System.out.println(daysInMonth);
        } else {
             System.out.println("invalid date");
        }
    }
}
