package com.javarush.apache_commons_lang.compare_cats;

/*
Сравниваем котов
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Bonya", 5, 4, "Devon Rex");
        Cat cat2 = new Cat("Ginger", 5, 6, "Devon Rex");

        System.out.println(cat1.equals(cat2));
    }
}
