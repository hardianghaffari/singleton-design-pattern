package com.polper.latihan.Singleton;

public class main {
    public static void main(String[] args) {
        Singleton greeting1 = Singleton.getInstance();
        Singleton greeting2 = Singleton.getInstance();

        greeting1.greetingText = "Don't understand Singleton Pattern";
        System.out.println("No one said : " + greeting1.greetingText + "\n");

        greeting2.greetingText = "Hello world! I'm currently learning Singleton Pattern";
        System.out.println("Everyone said : " + greeting2.greetingText);

        System.out.println("Guntur said : " + greeting1.greetingText);
        System.out.println("Ghaffa said : " + greeting2.greetingText);
        System.out.println("Rijal said : " + greeting2.greetingText);
    }
}
