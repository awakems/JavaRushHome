package com.javarush.test.level06.lesson05.task04;

/* Cчётчик котов
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
*/

public class Cat
{
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        catCount--;
    }

    //Напишите тут ваш код

    public static void main(String[] args) {
    }
}
