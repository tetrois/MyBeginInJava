package RandomTest;


import java.lang.reflect.Array;

/**
 * Created by TetRoIS on 03.07.2015.
 * Удачная попытка сделать поиск индекса элемента массива методом "Золотого сечения"
 */
public class ArrayByteSort
{
    public static void main(String []args)throws Exception{
        long startTime = System.currentTimeMillis(); //Счетчик времени выполнения кода (начало)
        int n = 50000000;
        int arr[] = new int[n]; //= {'a','b','c','d'};
        for (int i = 0; i<n;i++){
           arr[i] = i;
        }


        System.out.println("Всего символов: "+arr.length);
        System.out.println("ID искомого символа в массиве: "+(java.util.Arrays.binarySearch(arr,500 )));

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");//Вывод счетчика времени выполнения кода (конец)

    }

    public static int  ByteSortVer1(int a[], int searchElement){
        int s4c = 0;
        int center = (a.length / 2);
        int res = center;
        while(searchElement!=a[center]){
            System.out.println("Идет цикл номер:" + s4c++);
            System.out.println("Текущий центр" + center);
            if (searchElement<a[center])
            {
                if(center<=2) {
                    if(a[1]==searchElement)res = 1; else
                    if(a[0]==searchElement) res = 0; else
                        res = -1;
                    break;
                } else
                {
                    center = center / 2;
                    res = center;
                }
            }else{
                if((a.length - center)<=2)
                {
                    if(a[a.length-1]==searchElement) res = a.length-1; else
                    if(a[a.length-2]==searchElement) res = a.length-2; else res = -1;
                    break;
                }else
                {
                    center += (a.length - center) / 2;
                    res = center;
                }
            }
        }
        return res;
    }

}



