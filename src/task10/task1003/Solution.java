package task10.task1003;

/*
Задача №3 на преобразование целых типов
Добавить одну операцию по преобразованию типа, чтобы получался ответ: b = 0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128;
        int i = (byte) f;
        int b = (int) (i + f);
        System.out.println(b);
    }
}
