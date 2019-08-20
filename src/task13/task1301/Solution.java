package task13.task1301;


/*
Пиво
1. Подумай, какой из двух интерфейсов нужно реализовать в классе BeerLover.
2. Добавь к классу BeerLover этот интерфейс и реализуй все его методы.
3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic{
        public void askForMore(String message){}

        public void sayThankYou(){}

        public boolean isReadyToGoHome(){
            if (READY_TO_GO_HOME) return true;
                return false;
        }

        public boolean READY_TO_GO_HOME = false;
        public void sleepOnTheFloor(){}

    }
}