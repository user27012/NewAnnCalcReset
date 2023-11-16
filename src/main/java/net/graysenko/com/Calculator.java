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
    /**
     * Поле для зберігання результату калькуляції.
     */
    private double result;

    /**
     * Конструктор за замовчуванням, ініціалізує результат нулем.
     */
    public Calculator() {
        this.result = 0;
    }

    /**
     * Метод для виконання додавання числа до результату.
     *
     * @param number Число для додавання.
     */
    @CalculatorOperation("Додавання")
    public void add(double number) {
        result += number;
    }

    /**
     * Метод для виконання віднімання числа від результату.
     *
     * @param number Число для віднімання.
     */
    @CalculatorOperation("Віднімання")
    public void subtract(double number) {
        result -= number;
    }

    /**
     * Метод для виконання множення результату на число.
     *
     * @param number Число для множення.
     */
    @CalculatorOperation("Множення")
    public void multiply(double number) {
        result *= number;
    }

    /**
     * Метод для виконання ділення результату на число.
     *
     * @param number Число для ділення.
     */
    @CalculatorOperation("Ділення")
    public void divide(double number) {
        if (number != 0) {
            result /= number;
        } else {
            System.out.println("Ділення на нуль неможливе.");
        }
    }

    /**
     * Метод для отримання поточного результату.
     *
     * @return Поточний результат калькуляції.
     */
    public double getResult() {
        return result;
    }
}
