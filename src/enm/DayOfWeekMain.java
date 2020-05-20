package enm;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    public static String getWorkingHours(DayOfWeek dayOfWeek){
        int workHours = 0;
        if(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return "Сегодня выходной";
        } else {
            for (int i = dayOfWeek.ordinal(); i <= DayOfWeek.SUNDAY.ordinal(); i++) {
                workHours += DayOfWeek.values()[i].getWorkHour();
            }
            return String.valueOf(workHours);
        }
    }
}
