package hackerrank;

import java.util.Scanner;

/**
 * Created by TetRoIS on 08.07.2015.
 */
public class JavaLoops_HackerRank
{
    public static int [][]arr;
    public static Scanner rdr = new Scanner(System.in);
    public static void main(String []args)
        {
            int t = rdr.nextInt();
            CreateArray(t);
            for(int i =0;i<t;i++)
            {
                for (int j = 0; j < arr[i].length; j++)
                {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    public static void CreateArray(int t){
        arr = new int[t][];
        for (int i =0;i<t;i++)
        {
            int a = rdr.nextInt();
            int b = rdr.nextInt();
            int n = rdr.nextInt();
            arr[i] = new int[n];
            SeriesLoops(a,b,n,arr,i);
        }
    }

    public static void SeriesLoops(int a,int b,int n,int[][] arr,int numArr){
        if((a>=0 && a<=50) && ((b>=0 && b<=50) && (n>=1 && n<=15)))
        {
           for(int i=1; i <= n;i++)
            {
                int answer = 0;
                for (int j = 1; j <= i; j++)
                {
                    answer += (int) Math.pow(2, j - 1) * b;
                }
                arr[numArr][i-1] = answer + a;
            }
        }
    }
}
