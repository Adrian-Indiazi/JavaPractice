import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

 class Calculator {
    private double result;

    public Calculator() {
        result = 0.0;
    }

    public double add(double number) {
        result += number;
        return result;
    }

    public double subtract(double number) {
        result -= number;
        return result;
    }

    public double multiply(double number) {
        result *= number;
        return result;
    }

    public double divide(double number) {
        if (number != 0) {
            result /= number;
            return result;
        } else {
            // Handle division by zero error
            return Double.NaN;
        }
    }

    public double getResult() {
        return result;
    }

    public void clear() {
        result = 0.0;
    }

}
    public class Hello{
        static Calculator basicCalculator = new Calculator(

        );
        static Calculator scientificCalculator = new Calculator();

        public static void main(String[] args) {


// Use the basic calculator
        basicCalculator.add(5);
        basicCalculator.multiply(3);
        System.out.println("Basic Calculator Result: " + basicCalculator.getResult());

// Use the scientific calculator
        scientificCalculator.add(10);
        scientificCalculator.divide(2);
        System.out.println("Scientific Calculator Result: " + scientificCalculator.getResult());
    }

}
