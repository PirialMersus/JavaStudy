package task12.task1219;

/*
Создаем человека
Есть public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
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


    public class Human implements CanRun, CanSwim{
        public void run(){};
        public void swim(){};

    }

    public class Duck implements CanSwim, CanFly{
        public void swim(){};
        public void fly(){};

    }

    public class Penguin implements CanSwim, CanRun{
        public void swim(){};
        public void run(){};

    }

    public class Airplane implements CanFly{
        public void fly(){};

    }
}
