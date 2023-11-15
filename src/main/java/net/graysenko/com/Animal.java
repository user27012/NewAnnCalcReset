package net.graysenko.com;

import java.lang.annotation.Inherited;

public class Animal {

    @Deprecated
    public void makeSound() {
        System.out.println("Звуки животного");
    }
}
