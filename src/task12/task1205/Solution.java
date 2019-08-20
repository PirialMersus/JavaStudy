package task12;
/*
Определимся с животным
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат - одно значение из: "Корова", "Кит", "Собака", "Неизвестное животное".
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String pet;
        if (o instanceof Cow){
            pet = "Корова";
        }
        else if (o instanceof Dog){
            pet = "Собака";
        }
        else if (o instanceof Whale){
            pet = "Кит";
        }
        else pet = "Неизвестное животное";

        return pet;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}