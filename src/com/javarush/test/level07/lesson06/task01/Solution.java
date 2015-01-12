package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> list = new ArrayList<String>();
        list.add("asd");
        list.add("bbc");
        list.add("fred");
        list.add("orbit");
        list.add("release");
        System.out.println(list.size());//Напишите тут ваш код
        for (String  str : list) System.out.println(str);
    }
}
