package less002;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by TetRoIS on 28.06.2015.
 */

/* 18+
������ � ���������� ��� � �������. ���� ������� ������ 18 ������� ������� ��������� ���.
*/
public class Solution3
{
 public static void main(String[]args) throws Exception
 {
     BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

     String name = rdr.readLine();
     int age = Integer.parseInt(rdr.readLine());

     if (age>20) System.out.println("� 18-�� ����������");

 }

}
