package net.graysenko.com;

import java.lang.annotation.Inherited;


public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }

    @SuppressWarnings("unchecked")
    public void ignoreWarning() {
        Object obj = (String) "Тут стринг";
    }
}
