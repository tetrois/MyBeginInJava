package less002;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by TetRoIS on 28.06.2015.
 */

/* —равнить имена
*¬вести с клавиатуры два имени, и если имена одинаковые вывести сообщение Ђ»мена идентичныї.
* ≈сли имена разные, но их длины равны Ц вывести сообщение Ц Ђƒлины имен равныї.
*/
public class Solution2
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        String name1 = rdr.readLine();
        String name2 = rdr.readLine();

        int n1 = name1.length();
        int n2 = name2.length();

        if (name1.equals(name2)){
            System.out.println("»мена идентичны");
        }else if (n1==n2){

            System.out.println("ƒлины имен равны");
        }

    }
}
