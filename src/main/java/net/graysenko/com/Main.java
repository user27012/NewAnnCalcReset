package net.graysenko.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкту калькулятора
        Calculator calculator = new Calculator();

        // Створення об'єкту Scanner для отримання введених даних в консолі
        Scanner scanner = new Scanner(System.in);

        // Введення першого числа
        System.out.print("Введіть перше число: ");
        double number1 = scanner.nextDouble();

        // Введення операції
        System.out.print("Введіть операцію (+, -, *, /): ");
        String operation = scanner.next();

        // Введення другого числа
        System.out.print("Введіть друге число: ");
        double number2 = scanner.nextDouble();

        // Виконання вибраної операції
        switch (operation) {
            case "+":
                calculator.add(number1);
                calculator.add(number2);
                break;
            case "-":
                calculator.subtract(number1);
                calculator.subtract(number2);
                break;
            case "*":
                calculator.multiply(number1);
                calculator.multiply(number2);
                break;
            case "/":
                calculator.divide(number1);
                calculator.divide(number2);
                break;
            default:
                System.out.println("Невідома операція");
        }

        // Виведення результату на екран
        System.out.println("Результат: " + calculator.getResult());
    }
}
