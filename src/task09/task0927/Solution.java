package task09.task0927;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Barsik", new Cat("Barsik"));
        map.put("Barsik1", new Cat("Barsik1"));
        map.put("Barsik2", new Cat("Barsik2"));
        map.put("Barsik3", new Cat("Barsik3"));
        map.put("Barsik4", new Cat("Barsik4"));
        map.put("Barsik5", new Cat("Barsik5"));
        map.put("Barsik6", new Cat("Barsik6"));
        map.put("Barsik7", new Cat("Barsik7"));
        map.put("Barsik8", new Cat("Barsik8"));
        map.put("Barsik9", new Cat("Barsik9"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
                                //ключ
            set.add(pair.getValue());
        }
        return set;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}