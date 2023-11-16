package net.graysenko.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть перше число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введіть операцію (+, -, *, /): ");
        String operation = scanner.next();


        System.out.print("Введіть друге число: ");
        double number2 = scanner.nextDouble();


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

        System.out.println("Результат: " + calculator.getResult());
    }
}
