package task12.task1210;

/*
Три метода и максимум
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int max(int a, int b){
        if (a > b) return a;
        else return b;
    }
    public static long max(long c, long d){
        if (c > d) return c;
        else return d;
    }
    public static double max(double k, double f){
        if (k > f) return k;
        else return f;
    }
}