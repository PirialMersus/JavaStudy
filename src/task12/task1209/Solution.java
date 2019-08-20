package task12.task1209;
/*
Три метода и минимум
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int a, int b){
        if (a < b) return a;
        else return b;
    }
    public static long min(long c, long d){
        if (c < d) return c;
        else return d;
    }
    public static double min(double k, double f){
        if (k < f) return k;
        else return f;
    }


}