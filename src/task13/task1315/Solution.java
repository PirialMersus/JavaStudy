package task13.task1315;

/*
Том, Джерри и Спайк
1. Создай классы Dog, Cat и Mouse.
2. Реализуй интерфейсы в добавленных классах, учитывая что:
- Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь(Mouse) может передвигаться и может быть съедена.
- Собака(Dog) может передвигаться и съесть кого-то.
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    public static class Cat implements Movable, Edible, Eat
    {
        public void eat(){}
        public void beEaten(){}
        public void move(){}

    }
    public static class Dog implements Movable, Eat
    {
        public void move(){}
        public void eat(){}

    }
    public static class Mouse implements Movable, Edible
    {
        public void move(){}
        public void beEaten(){}

    }

}