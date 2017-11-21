package com.company.lessons14;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ListOfHolidays {

    public static void main(String[] args) throws ParseException {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat format1 = new SimpleDateFormat("dd. MM.yyyyг. ");
        Date[] dates = new Date[5];
        dates[0] = df.parse("01.01.2017");
        dates[1] = df.parse("07.01.2017");
        dates[2] = df.parse("08.03.2017");
        dates[3] = df.parse("01.05.2017");
        dates[4] = df.parse("09.05.2017");

        String[] holidays = new String[5];
        holidays[0] = "Новый год";
        holidays[1] = "Рождество";
        holidays[2] = "8 Марта";
        holidays[3] = "1 мая";
        holidays[4] = "9 мая";

        for (int i = 0; i < 5; i++) {
            System.out.println(format1.format(dates[i]) + " " + holidays[i]);
        }
    }
}
