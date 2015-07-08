package hackerrank;

import java.io.*;

/**
 * Created by TetRoIS on 08.07.2015.
 */
public class JavaDatatypes_HackerRank
{
    public static void main(String []args) throws IOException
    {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        int numLoop = Integer.parseInt(rdr.readLine());
        for(int i=0; i<numLoop;i++)
        {
            String a = rdr.readLine();
            Output(a);
        }
    }

    public static void Output(String a){
            try{
                long n = Long.parseLong(a);
                System.out.println(n + " can be fitted in:");
                if ((n >= -128L) && (n <= 127L))
                {
                    System.out.println("* byte");
                }
                if ((n >= -32768L) && (n <= 32767L))
                {
                    System.out.println("* short");
                }
                if ((n >= -2147483648L) && (n <= 2147483647L))
                {
                    System.out.println("* int");
                }
                if ((n >= -9223372036854775808L) && (n <= 9223372036854775807L))
                {
                    System.out.println("* long");
                }
            } catch (Exception e){
                System.out.println(a+" can't be fitted anywhere.");
            }
    }
}
