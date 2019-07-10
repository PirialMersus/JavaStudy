package task10.task1013;


/*
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        public int age;
        public boolean sex;
        public String name;
        public String job;
        public Human mother;
        public Human father;

        public Human (int age){
            this.age = age;
        }
        public Human (String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        public Human (Human mother, String name){
            this.mother = mother;
            this.name = name;
        }
        public Human (String name, String job){
            this.name = name;
            this.job = job;
        }
        public Human (Human father, Human mother, boolean sex){
            this.father = father;
            this.mother = mother;
            this.sex = sex;
        }
        public Human (int age, String name, String job, Human father, Human mother){
            this.age = age;
            this.name = name;
            this.job = job;
            this.father = father;
            this.mother = mother;
        }
        public Human (){
        }
        public Human (boolean sex){
            this.sex = sex;
        }
        public Human (boolean sex, Human father){
            this.sex = sex;
            this.father = father;
        }
        public Human (Human mother){
            this.mother = mother;
        }

    }
}
