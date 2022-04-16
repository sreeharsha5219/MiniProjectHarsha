package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class calculator {

    public static final Logger logger = LogManager.getLogger(calculator.class);

    public calculator() {}

    public static void main(String[] args) {
        calculator cal = new calculator();
        Scanner scanner = new Scanner(System.in);
        double inp1, inp2;

        do {
            System.out.println("1 - a power b ");
            System.out.println("2 - square Root ");
            System.out.println("3 - natural Log ");
            System.out.println("4 - Factorial ");
            System.out.println("5 - exit ");
            int operation;

            try {
                operation = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            if (operation < 1 || operation > 4) {
                return;
            }
            System.out.println("Give a possible integer");
            inp1 = scanner.nextDouble();

            switch (operation) {
                case 1:
                    System.out.print("Give second input");
                    inp2 = scanner.nextDouble();
                    System.out.println("b power a = " + calculator.power(inp1, inp2));
                    break;

                case 2:
                    System.out.println("Square root of x = " + calculator.sqt(inp1));
                    break;
                case 3:
                    System.out.println("Natural log of x = " + calculator.log(inp1));
                    break;
                case 4:
                    System.out.println("Factorial of x = " + calculator.factorial(inp1));
                    break;
                default:
                    System.out.print("Exited");
                    return;
            }
        } while (true);
    }
    public static double power(double a, double b) {
        logger.info("power of " + a + " power " + b);
        double Output = Math.pow(a, b);
        logger.info("Output= " + Output);
        return Output;
    }

    public static double sqt(double num) {
        double Output = 0;
        try {
            logger.info("sqrt - " + num);
            if (num < 0) {
                Output = Double.NaN;
                throw new ArithmeticException("sqrt not supported");
            } else {
                Output = Math.sqrt(num);
            }
        } catch (ArithmeticException error) {
            logger.error(" sqrt is not supported");
        } finally {
            logger.info("Output = " + Output);
        }
        return Output;
    }

    public static double factorial(double num) {
        logger.info("factorial - " + num);
        double Output = 1.0;
        for (int t = 1; t <= num; t++) {
            Output *= t;
        }
        logger.info("Output = " + Output);
        return Output;
    }
    public static double log(double num) {
        Double Output = 0.0;
        try {
            logger.info("log of - " + num);
            if (num < 0) {
                Output = Double.NaN;
                throw new ArithmeticException("Log is not supported");
            } else if (num == 0) {
                Output = Double.NEGATIVE_INFINITY;
                throw new ArithmeticException("Log is not defined");
            } else {
                Output = Math.log(num);
            }
        } catch (ArithmeticException error) {
            logger.error("Inout out of range");
        } finally {
            logger.info("Output = " + Output);
        }
        return Output;
    }

}