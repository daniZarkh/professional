package com.javarush.apache_commons_lang.string_utils.back_to_source;

/*
Вернуться к истокам
*/

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        boolean result = helloWorldChecker(choice);
        System.out.println("The result is: " + result);
    }

    public static boolean helloWorldChecker(String s) {
        return StringUtils.containsOnly(s, "Helo Wrd!");
    }
}
