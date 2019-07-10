package task09.task0905;

/*
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
        System.out.println(deep);
    }

    public static int getStackTraceDeep() {
        return Thread.currentThread().getStackTrace().length;
    }
}

