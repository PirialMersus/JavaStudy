package task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        DateFormat format = new SimpleDateFormat("MMMM", Locale.ENGLISH);
        int day;

        Date date_1 = null;
        try {
            date_1 = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat formatd = new SimpleDateFormat("M");
        int month = Integer.parseInt(formatd.format(date_1));
        System.out.println(month);
    }
}
