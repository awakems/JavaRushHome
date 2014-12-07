package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name;
    private int weight;
    private int age;
    private String color;
    private String adres;

    public void initialize (String name){
        this.name = name;
        //this.weight = 5;
        //this.age = 3;
        //this.color = "grey";
        //this.adres = null;
    }

    public void initialize (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        //this.adres = null;
        //this.color = null;
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        //this.adres = null;
        //this.color = null;
    }

    public void initialize (int weight, String color){
        this.name = null;
        this.weight = weight;
        this.age = 0;
        this.adres = null;
        this.color = color;
    }

    public void initialize (int weight, String color, String adres){
        this.name = null;
        this.weight = weight;
        this.age = 0;
        this.adres = adres;
        this.color = color;
    }

}
