package task09.task0926;

import java.util.ArrayList;

/*
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
•	Метод createList должен возвращать созданный список.
•	Метод createList должен добавлять в список 5 элементов.
•	Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
•	Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list= new ArrayList<>();
        list.add(new int[]{2,6,9,8,5});
        list.add(new int[]{2,6});
        list.add(new int[]{2,6,9,8});
        list.add(new int[]{2,6,9,8,5,9,0});
        list.add(new int[]{});
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}