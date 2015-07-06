package RandomTest;

/**
 * Created by TetRoIS on 06.07.2015.
 */
public class Array_x2
{
    public static void main(String []args){

        int qwe = 3;
        int a[][] = new int[qwe][qwe];

        if (qwe<=2){
            for(int i = 0;i<qwe;i++){
                for(int j = 0;j<qwe;j++){
                    a[i][j]=1;
                }
            }
        }else{
            for(int i = 0;i<qwe;i++){
                for(int j = 0;j<qwe;j++){


                    a[i][j]=1;
                }
            }
        }

        //Output array
        for(int i = 0;i<qwe;i++){
            System.out.println();
            for(int j = 0;j<qwe;j++){
                System.out.print(a[i][j]);
            }
        }

    }
}
