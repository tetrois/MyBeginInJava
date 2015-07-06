package RandomTest;

/**
 * Created by TetRoIS on 05.07.2015.
 */
public class EgeMathTest001
{
    public static void main(String[]args){


        System.out.println(MathEge001(-1,-1,-2));


    }

    public static double MathEge001(double ln, double op, double tr)
    {
        double r;

        r = 25 * (((2*ln + op + 3 * tr)/6)+2);
        return r;
    }
}
