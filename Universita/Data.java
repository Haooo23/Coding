package Universita;

import java.util.Calendar;

public class Data {
    private int day, month, year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
        
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isTwoYearsAgo() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1; 
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);

        if (currentYear - year == 2) {
            if (currentMonth == month) {
                if (currentDay == day) {
                    return true;
                }
            }
        }

        return false;
    }

}
