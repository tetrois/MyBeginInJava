package less002;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by TetRoIS on 28.06.2015.
 */
public class test001
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        String name = rdr.readLine();
        String result;
        Boolean a = false;

        if (a)
        {
            result = "буду";
        }else
        {
            result = "не буду";
        }
        System.out.println(name+", я "+result+" играть в танки!");


    }
}
