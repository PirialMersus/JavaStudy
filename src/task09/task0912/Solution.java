package task09.task0912;

/*
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try
        {

        int num = Integer.parseInt("XYZ");
        System.out.println(num);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}