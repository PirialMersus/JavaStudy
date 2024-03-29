package task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String s2 = "";
        s2 = s2 + s.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < s.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(s.substring(i-1, i)))
                s2 = s2 + s.substring(i, i+1).toUpperCase();
            else
                s2 = s2 + s.substring(i, i+1);
        }
        System.out.println(s2);

        //напишите тут ваш код
    }
}

/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать строку с клавиатуры.
•	Класс Solution должен содержать один метод.
•	Программа должна заменять в тексте первые буквы всех слов на заглавные.
 */