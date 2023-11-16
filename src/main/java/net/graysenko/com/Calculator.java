package net.graysenko.com;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CalculatorOperation {
    String value();
}

public class Calculator {

    private double result;


    public Calculator() {
        this.result = 0;
    }


    @CalculatorOperation("Додавання")
    public void add(double number) {
        result += number;
    }


    @CalculatorOperation("Віднімання")
    public void subtract(double number) {
        result -= number;
    }


    @CalculatorOperation("Множення")
    public void multiply(double number) {
        result *= number;
    }


    @CalculatorOperation("Ділення")
    public void divide(double number) {
        if (number != 0) {
            result /= number;
        } else {
            System.out.println("Ділення на нуль неможливе.");
        }
    }


    public double getResult() {
        return result;
    }
}
