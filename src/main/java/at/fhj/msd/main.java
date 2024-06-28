package at.fhj.msd;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Calculator calculator
                = new Calculator();
        System.out.println(calculator.add(3, 7));
        System.out.println(calculator.minus(4, 2));
        System.out.println(calculator.divide(10, 2));
        System.out.println(calculator.multiply(2, 6));


        logger.error("It is an error logger.");
        logger.info("It is a info logger.");



        System.out.println("Alexandra Krapf");
    }
}
