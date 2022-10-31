package org.ikechukwu.singleton;

class Singleton1 {
    private static Singleton1 instance;

    // Private Constructor
    private Singleton1() {
        // Exists only to defeat instantiation.
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}


public class Singleton {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        System.out.println(s1);
        Singleton1 instance = Singleton1.getInstance();
        System.out.println(instance);
    }
}


