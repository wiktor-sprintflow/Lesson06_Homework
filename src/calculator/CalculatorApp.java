package calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int number1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Podaj drugą liczbę: ");
        int number2 = sc.nextInt();
        sc.nextLine();

        sc.close();

        Calculator calculator = new Calculator();
        System.out.println(calculator.compareNumbers(number1,number2));
    }
}