package task13.task1319;

import java.io.*;
import java.util.ArrayList;

/*
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        ArrayList<String> list = new ArrayList<String>();

        String s = "";
        while (true){
            s = reader.readLine();

            if (s.equals("exit")) break;
            list.add(s);
            list.add("\r\n");
        }

        FileWriter file = new FileWriter("d:/"+ fileName+".txt");
        for(String str: list){
            file.write(str);
        }
        file.close();



    }
}
