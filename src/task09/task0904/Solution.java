package task09.task0904;

/*
Стек-трейс длиной 10 вызовов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
        System.out.println(stackTraceLength);
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        method3();
        return method3();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        method4();
        return method4();
    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        method5();
        return method5();
    }

    public static StackTraceElement[] method5() {
        method6();
        return method6();
    }

    public static StackTraceElement[] method6() {
        method7();
        return method7();
    }

    public static StackTraceElement[] method7() {
        method8();
        return method8();
    }

    public static StackTraceElement[] method8() {
        method9();
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}
