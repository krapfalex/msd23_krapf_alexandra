package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public static double add(double number1, double number2) {
        logger.debug("Called with parameters " + number1 + " " + number2);
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {

        logger.debug("Called with parameters " + number1 + " " + number2);
        return number1 - number2;
    }

    public static double divide(double number1, double number2) {
        logger.debug("Called with parameters " + number1 + " " + number2);
        if (number2 == 0) {
            logger.error("division by 0");
            throw new ArithmeticException();
        }
        return number1/number2;
    }

    public static double multiply(double number1, double number2) {
        logger.debug("Called with parameters " + number1 + " " + number2);
        return number1 * number2;
    }

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
