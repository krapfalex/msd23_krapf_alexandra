package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    /**
     *idk what that is
     */
    private static Logger logger = LogManager.getLogger();


    /**
     * This method adds two numbers
     * @param number1 first number for addition
     * @param number2 second number for addition
     * @return returns the result
     */
    public static double add(double number1, double number2) {
        logger.debug("Called with parameters " + number1 + " " + number2);
        return number1 + number2;
    }

    /**
     * This method subtracts numbers
     * @param number1 Number that gets subtracted from
     * @param number2 Number that gets subtracted
     * @return returns result
     */
    public static double minus(double number1, double number2) {

        logger.debug("Called with parameters " + number1 + " " + number2);
        return number1 - number2;
    }

    /**
     *This method divides numbers
     * @param number1 dividend
     * @param number2 divisor
     * @return returns result
     * @throws ArithmeticException throws an arithmetic exception when number,32 is 0
     */
    public static double divide(double number1, double number2) {
        logger.debug("Called with parameters " + number1 + " " + number2);
        if (number2 == 0) {
            logger.error("division by 0");
            throw new ArithmeticException();
        }
        return number1/number2;
    }

    /**
     * This method multiplies two numbers
     * @param number1 first number for multiplication
     * @param number2 second number for multiplication
     * @return returns result
     */
    public static double multiply(double number1, double number2) {
        logger.debug("Called with parameters " + number1 + " " + number2);
        return number1 * number2;
    }

    /**
     * This method calculates the faculty of a number
     * @param number number of which the faculty will be calculated
     * @return returns result
     */
    public static int factorial(int number) {
        logger.debug("Called with parameter " + number);
        int faculty = 1;
        if (number > 0) {
            for (; number > 0; number--) {
                faculty *= number;
            }
            return faculty;
        }
        return 0;
    }
}
