package com.javarush.lang.object_utils_objects.sewed_on_soap;

import java.util.Objects;

/*
Шило на мыло
*/

public class Solution {

    public static void main(String[] args) {
        String[] array1 = {null, "hello", "ok", null, "bye"};
        String[] array2 = {"thanks", "hello", "ok", "bye"};

        printFirstNonNull(array1);
        System.out.println("----------");
        printDefaultValueIfNullObject(array1, "oops");
    }

    public static void printFirstNonNull(final String... values) {
        if (Objects.isNull(values)) {
            System.out.println((Object) null);
        }
        for (final String value : values) {
            if (Objects.nonNull(value)) {
                System.out.println(value);
                break;
            }
        }
    }

    public static void printDefaultValueIfNullObject(final String[] values, final String defaultValue) {
        for (String o : values) {
            System.out.println(Objects.requireNonNullElse(o, defaultValue));
        }
    }
}
