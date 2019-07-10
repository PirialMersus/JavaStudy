package task08.task0827;

import java.util.Date;
import java.util.*;
import java.text.*;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JAN 2 2013"));
    }

    public static boolean isDateOdd(String date) {
        DateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        int day;

        Date date_1 = null;
        try {
            date_1 = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat formatd = new SimpleDateFormat("D");
        day = Integer.parseInt(formatd.format(date_1));
        System.out.println(day);

        boolean k;
        if (day % 2 != 0)
            k = true;
        else k = false;

        return k;
        // String string = "January 2, 2010";
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        // LocalDate date_1 = LocalDate.parse(string, formatter);
        // System.out.println(date_1); // 2010-01-02
    }
}

/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
•	Программа должна выводить текст на экран.
•	Класс Solution должен содержать два метода.
•	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
•	Метод main() должен вызывать метод isDateOdd().
 */
