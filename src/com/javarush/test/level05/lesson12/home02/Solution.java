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
        Man mudak1 = new Man("Vasia", 44, "Folder12");// Создай по два объекта каждого класса тут
        Man mudak2 = new Man("Andy", 43, "Zavodska 45");

        Woman telka1 = new Woman("Assdd", 12, "tp");
        Woman telka2 = new Woman("ssdd", 12, "tp");

        System.out.println(mudak1);
        System.out.println(mudak2);
        System.out.println(telka1);
        System.out.println(telka2);
    }

    static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            String line = name + " " + age + " " + address;
            return line;
        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            String line = name + " " + age + " " + address;
            return line;
        }
    }// Напиши тут свои классы
// Напиши тут свои классы
}
