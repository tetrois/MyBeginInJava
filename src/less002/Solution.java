package less002;

/**
 * Created by TetRoIS on 27.06.2015.
 */
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
            BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(rdr.readLine());
        int b = Integer.parseInt(rdr.readLine());
        int c = Integer.parseInt(rdr.readLine());


        if (a>b && a>c)
        {
            System.out.println(a);
            if (b<c)
            {
                System.out.println(c);
                System.out.println(b);
            }
            else
            {
                System.out.println(b);
                System.out.println(c);
            }
        }
        else if (b>a && b>c)
        {
            System.out.println(b);
            if (a<c)
            {
                System.out.println(c);
                System.out.println(a);
            }
            else
            {
                System.out.println(a);
                System.out.println(c);
            }

        }
        else if (c>a && c>b)
        {
            System.out.println(c);
            if (b<a)
            {
                System.out.println(a);
                System.out.println(b);
            }
            else
            {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}