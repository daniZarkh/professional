package com.javarush.apache_commons.no_templates;

/*
Нам шаблоны не нужны
*/

public class Solution {

    public static void main(String[] args) {
        Person person1 = new Person("Bob", 33, 80, 179,"male");
        Person person2 = new Person("Mary", 35, 60, 165, "female");

        System.out.println(person1);
        System.out.println(person2);
    }
}
