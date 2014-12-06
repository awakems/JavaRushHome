package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int tmp =0;
        for (int i=0; i<3; i++) {
            if (a<b){
                tmp = a;
                a=b;
                b=tmp;
            }

            if (b<c){
                tmp = b;
                b=c;
                c=tmp;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}
