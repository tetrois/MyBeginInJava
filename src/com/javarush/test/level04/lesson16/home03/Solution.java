package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int a = 0;
        //int a = Integer.parseInt(rdr.readLine());
        while (a!=(-1))
        {

            int a1 = Integer.parseInt(rdr.readLine());
            a = a1;
            sum = sum + (a1);
        }
        System.out.println(sum);
    }
}
