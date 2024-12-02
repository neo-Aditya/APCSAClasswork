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
    //TODO: MAke Fix
    return 1; //temp
   }
}
