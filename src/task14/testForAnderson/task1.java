package task14.testForAnderson;

/*Составить алгоритм: если введенное число больше 7, то вывести “Привет”
*/

import java.io.*;
public class task1 {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            int number = Integer.parseInt(s);
            if (number > 7)
                System.out.println("Привет");
        }
    }
