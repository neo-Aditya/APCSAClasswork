public class APCalander {
    public static int numberOfLeapYears(int startYear, int endYear) {
        int numberofLeapYears = 0;
        for (int i = startYear; i < endYear; i++) {
            numberofLeapYears += isLeapYear(i) ? 1 : 0;
        }
        return numberofLeapYears;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && !((year % 100 == 0) && (year % 400 != 0));
    }

    public static int dayOfWeek(int year, int month, int day) {
        int dayOfWeek = firstDayOfYear(year) + dayOfYear(month, day, year) - 1;
        return dayOfWeek % 7;
    }

    public static int firstDayOfYear(int year) {
        int dayOfWeek = (year - numberOfLeapYears(1, year)) * 365 + numberOfLeapYears(0, year) * 366;
        return  dayOfWeek % 7;
    }

   public static int dayOfYear(int month, int day, int year) {
    if (month == 1) return day;
    day += 31;
    if (month == 2) return day;
    day += isLeapYear(year) ? 29 : 28;
    if (month == 3) return day;
    day += 31;
    if (month == 4) return day;
    day += 30;
    if (month == 5) return day;
    day += 31;
    if (month == 6) return day;
    day += 30;
    if (month == 7) return day;
    day += 31;
    if (month == 8) return day;
    day += 30;
    if (month == 9) return day;
    day += 30;
    if (month == 10) return day;
    day += 31;
    if (month == 11) return day;
    day += 30;
    if (month < 1 || month > 12) return -1;
    return day;
   }
}
