package task09.task0908;

/*
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try
        {

            String s = null;
            String m = s.toLowerCase();
        }
        //напишите тут ваш код
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
