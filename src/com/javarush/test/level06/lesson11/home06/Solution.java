package com.javarush.test.level06.lesson11.home06;

/* KissMyShinyMetalAss
Создай класс с именем KissMyShinyMetalAss. Создай объект этого класса, выведи его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        KissMyShinyMetalAss alt = new KissMyShinyMetalAss("Good");
        System.out.println(alt);
    }

    public static class KissMyShinyMetalAss
    {
        private String name;

        public KissMyShinyMetalAss(String name) {
            this.name = name;
        }
//        @Override
//        public String toString(){
//            System.out.println(name);
//        }
    }

}
