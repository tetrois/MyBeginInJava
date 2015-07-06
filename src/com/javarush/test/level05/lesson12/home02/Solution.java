package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{

    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man m1 = new Man("Peter",21,"LOL str");
        Man m2 = new Man("Volodya",15,"LOL2 str");
        Woman w1 = new Woman("Lila",22,"qwert");
        Woman w2 = new Woman("Amy",23,"qwert2");

        System.out.println(m1.name + " " + m1.age + " " + m1.address);
        System.out.println(m2.name + " " + m2.age + " " + m2.address);
        System.out.println(w1.name + " " + w1.age + " " + w1.address);
        System.out.println(w2.name + " " + w2.age + " " + w2.address);

        //выведи их на экран тут
    }

    public static class Man  //добавьте тут ваши классы
    {
        public String name,address;
        public int age;

        public Man(String name,int age,String address)
        {
           this.name = name;
           this.age = age;
           this.address = address;
        }
    }
    public static class Woman  //добавьте тут ваши классы
    {
        public String name,address;
        public int age;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
