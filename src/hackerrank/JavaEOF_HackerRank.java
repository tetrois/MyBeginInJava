package hackerrank;

import java.util.Scanner;

/**
 * Created by TetRoIS on 09.07.2015.
 * I not created is code!
 */
public class JavaEOF_HackerRank
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int lines = 1;
        while (true)
        {
            String line = input.nextLine();
            System.out.println(lines + " " + line);
            lines++;
            if (!input.hasNext())
            {
                break;
            }
        }
        input.close();
    }
}