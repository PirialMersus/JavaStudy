package task10.task1004;

/*
Задача №4 на преобразование целых типов
Добавить одну операцию по преобразованию типа, чтобы на экран вывелось 9
short number = 9;
char zero = '0';
int nine = (zero + number);
*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = ((int)zero + number);
        System.out.println((char)nine);
    }
}
