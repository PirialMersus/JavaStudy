package task12.task1227;


/*
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
Есть интерфейсы CanFly(летать), CanSwim(плавать), CanRun(бегать).
Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly{
        public void fly(){}

    }

    public class Penguin implements CanSwim, CanRun{
        public void swim(){}
        public void run(){}

    }

    public class Toad implements CanSwim{
        public void swim(){}

    }
}