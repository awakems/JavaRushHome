package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        if (n1>n2&&n1>n3&&n1>n4)
        {
            System.out.print (n1);
        }
        else if (n2>n1&&n2>n3&&n2>n4)
        {
            System.out.print (n2); }

        else if (n3>n1&&n3>n2&&n3>n4)
        {
            System.out.print (n3);
        }
        else System.out.print (n4);//Напишите тут ваш код

    }
}
