package net.graysenko.com;

import java.lang.annotation.Inherited;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.ignoreWarning();

        MyFunctionalInterface myFunc = () -> System.out.println("Какие то функции");
        myFunc.myMethod();
    }

    @SafeVarargs
    public static <T> void processItems(T... items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        void myMethod();
    }
}
