package task14.task1404;


/*
Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.

Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Cat> list = new ArrayList<Cat>();

        String s = "";
        while (true){
            s = reader.readLine();

            if (s.equals("")) break;
            list.add(CatFactory.getCatByKey(s));
        }
        for (Cat cat: list) {
            if (cat instanceof FemaleCat) {
                System.out.println((FemaleCat) cat);
            }
            if (cat instanceof MaleCat) {
                System.out.println((MaleCat) cat);
            } else {
                System.out.println(cat);
            }
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
