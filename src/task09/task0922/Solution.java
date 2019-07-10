package task09.task0922;
  //Ввести с клавиатуры дату в формате "2013-08-18"
  //Вывести на экран введенную дату в виде "AUG 18, 2013".
  //Воспользоваться объектом Date и SimpleDateFormat.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH);
        SimpleDateFormat format2 = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        try {
            Date date_1 = format.parse(s);
            System.out.println(format2.format(date_1).toUpperCase());
        } catch (ParseException e) {

        }


    }
}
