package com.company.book2.lesson4_5.lesson5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    private static final String NAME_PROPERTIES = "com.company.book2.lesson4_5.lesson5.messages";

    public static void getMessage(String message){
        ResourceBundle resourceBundle =
                ResourceBundle.getBundle(NAME_PROPERTIES,new Locale("en"));
        System.out.println(resourceBundle.getString(message));

    }
    public static void getMessage(String languageCode,String message){
        ResourceBundle resourceBundle =
                ResourceBundle.getBundle(NAME_PROPERTIES,new Locale(languageCode));
        System.out.println(resourceBundle.getString(message));
    }
    public static void main(String[] args) {
        getMessage("greetings");
        getMessage("goodbye");

        getMessage("en","greetings");
        getMessage("en","goodbye");

        getMessage("ru","greetings");
        getMessage("ru","goodbye");

        getMessage("by","greetings");
        getMessage("by","goodbye");

    }
}
