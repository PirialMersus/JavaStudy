package task13.task1327;


/* Битва роботов
1. Разобраться в том, что тут написано.
2. http://ragecollection.com/img/ragefaces/rage-guy.png
3. Смириться со своей участью и продолжить разбираться в коде.
4. ...
5. Порадоваться, что мы все поняли.

6. Изменить код согласно новой архитектуре и добавить новую логику:
6.1. Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
6.2. Отредактировать класс Robot учитывая AbstractRobot.
6.3. Расширить класс BodyPart новой частью тела "грудь".
6.4. Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).

7. http://ragecollection.com/img/ragefaces/fuck-yeah.png
*/

public class Solution
{
    public static void main(String[] args)
    {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotScond) {

        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        String name1 = ((Robot) robotFirst).getName();
        String name2 = ((Robot) robotScond).getName();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                name1, name2, attacked, defenced));
    }
}