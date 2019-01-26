package pl.sda.javastart;

import java.util.Date;

public class Main {
    public static void main(String[] arg) {
        System.out.println("Hello, world!");

        Date date = new Date();
        System.out.println(date);
        System.out.println("\"ADAM\"");
        // komentarz moze byc tutaj
        System.out.println("Adam \nNowak "); // tu będzie nowa linia
        // literały:
        System.out.println(13);
        System.out.println('a');
        System.out.println("napis");
        System.out.println(true);

        String text = "jakis text";
        String anotherText = new String("inny text");
        int length = text.length(); //pierwszy sposób
        System.out.println(length);
        System.out.println(text.length()); //drugi sposób

        String textWithWhitespaces = " Adam";
        System.out.println(textWithWhitespaces.trim());
    }
}
