package task10.task1001;

/*
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = a + 46;
        byte c = (byte) (a * b);
        double f = 1234.15;
        long d = (long) (a + (int)f / ((int) c + b));
        System.out.println(d);
    }
}
