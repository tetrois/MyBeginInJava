package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rdr.readLine());
        int b = Integer.parseInt(rdr.readLine());
        int c = Integer.parseInt(rdr.readLine());

        if ((a<b && a>c) || (a>b && a<c))
        {
            System.out.println(a);
        }
        else
        {
            if ((b<a && b>c) || (b>a && b<c))
            {
                System.out.println(b);
            }
            else
            {
                if ((c<b && c>a) || (c>b && c<a))
                {
                    System.out.println(c);
                }
            }
        }

    }
}
