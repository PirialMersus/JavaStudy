package task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.
*/

public class Solution {
    HashMap<String, Integer> map;

    public Solution() {
        this.map = new HashMap<String, Integer>();
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String id = reader.readLine();
        while (!id.isEmpty()) {
            String name = reader.readLine();
            solution.map.put(name, Integer.parseInt(id));
            id = reader.readLine();
        }
        for (Map.Entry<String, Integer> pair : solution.map.entrySet()) {
            System.out.println("Id=" + pair.getValue() + " Name=" + pair.getKey());
        }
    }
}
