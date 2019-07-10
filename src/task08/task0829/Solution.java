package task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> cities = new HashMap<>();
        while (true) {
            String city = reader.readLine();


            if (city.isEmpty()) break;
            String family = reader.readLine();
            cities.put(city, family);

        }


         String necessaryCity = reader.readLine();

         String familyName = cities.get(necessaryCity);
            System.out.println(familyName);
}
}

/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать один метод.
•	Программа должна вывести фамилию семьи по введенному городу.
 */