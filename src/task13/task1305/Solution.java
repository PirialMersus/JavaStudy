package task13.task1305;

/*
Четыре ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();

    }

    public static class Hobby implements Dream, Desire {
        int INDEX = 1;


        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}