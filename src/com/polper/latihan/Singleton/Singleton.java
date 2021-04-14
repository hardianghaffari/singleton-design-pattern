package com.polper.latihan.Singleton;

public class Singleton {
    private static Singleton greet;
    public String greetingText;

    private Singleton(){
        greetingText = "";
    }
    public static Singleton getInstance(){
        if(greet == null)
            greet = new Singleton();
        return greet;
    }
}
