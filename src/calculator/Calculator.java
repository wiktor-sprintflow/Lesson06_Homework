package calculator;

class Calculator {

    String compareNumbers(int number1, int number2) {
        String result;

        if (number1 > number2) {
            result = "Suma liczb " + number1 + " i " + number2 + " wynosi: " + add(number1, number2);
        } else if (number1 < number2) {
            result = "Iloczyn liczb " + number1 + " i " + number2 + " wynosi: " + multiply(number1, number2);
        } else {
            result = "Kwadrat liczby " + number1 + " wynosi: " + power(number1);
        }

        return result;
    }

    private int add(int number1, int number2) {
        return number1 + number2;
    }

    private int multiply(int number1, int number2) {
        return number1 * number2;
    }

    private double power(int number1) {
        return Math.pow(number1, 2);
    }
}