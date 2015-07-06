package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.BreakIterator;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        //System.out.print("сумма");
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String a = null;
        int b = 0;
        boolean q = true;
        while(q)
        {

            sum = sum + b;
            a = rdr.readLine();
            if (a.equals("сумма"))
            {
                q = false;
                break;
            }else
            {
                b = Integer.parseInt(a);
            }
        }

        System.out.print(sum);
    }
}
