package less001;

/**
 * Created by TetRoIS on 27.06.2015.
 */
public class Cat {

    public static void main(String[] args)
    {
        Cat1 cat1 = new Cat1();
        Cat1.count = Cat1.count +1;
        //напишите тут ваш код

        Cat1 cat2 = new Cat1();

        Cat1.count = Cat1.count +1;
        //напишите тут ваш код

        System.out.println("Cats count is " + Cat1.count);
    }
    public static class Cat1
    {
        public static int count = 0;
    }
}