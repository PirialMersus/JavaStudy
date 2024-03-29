package task12.task1218;

/*
Есть, летать и двигаться
Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove{
        public void eat(){};
        public void move(){};

    }

    public class Duck implements CanFly, CanMove, CanEat{
        public void eat(){};
        public void move(){};
        public void fly(){};

    }

    public class Car implements CanMove{
        public void move(){};

    }

    public class Airplane implements CanFly{
        public void fly(){};

    }
}