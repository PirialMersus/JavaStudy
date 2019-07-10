package task09.task0923;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Гласные и согласные
*/
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .
 */
public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = s.replace(" ", "");
        char[] cArray = s.toCharArray();

        ArrayList<Character> vowels_sort = new ArrayList<>();
        ArrayList<Character> consonants_sort = new ArrayList<>();
        for(int i = 0; i < cArray.length; i++) {
            if (isVowel(cArray[i]))
                vowels_sort.add(cArray[i]);
            else consonants_sort.add(cArray[i]);
        }
        for (int i = 0; i < vowels_sort.size(); i++){
            System.out.print(vowels_sort.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < consonants_sort.size(); i++){
            System.out.print(consonants_sort.get(i) + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}