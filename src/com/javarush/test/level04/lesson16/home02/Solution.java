package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());//Напишите тут ваш код
        int b = Integer.parseInt(reader.readLine());//Напишите тут ваш код
        int c = Integer.parseInt(reader.readLine());
        if (a <= b && a <= c && b <= c) System.out.println(b);
        else if (a <= b && a <= c && b >= c) System.out.println(c);//Напишите тут ваш код
        else System.out.println(c);//Напишите тут ваш код

    }
}
