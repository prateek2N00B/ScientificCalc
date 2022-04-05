import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class calc {

    private static final Logger logger = LogManager.getLogger(calc.class);

    public static double squareRoot(int value) {
        double answer;

        try {
            answer = Math.sqrt(value);
        } catch (Exception e) {
            logger.error("squareRoot error :: " + e);
            return -1;
        }

        return answer;
    }

    public static long factorial(int value) {
        if(value < 0) return -1;
        if(value == 0) return 1;
        return value * factorial(value-1);
    }

    public static long powerFunc(int base, int power) {
        return (long)Math.pow(base, power);
    }

    public static double natLog(double value) {
        double ans;

        try {
            ans = Math.log(value);
        } catch (ArithmeticException     e) {
            ans = 0;
            logger.error("Invalid natural log");
            System.out.println("Natural log error :: "+ e);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************************************************");
        System.out.println("Scientific calculator");
        System.out.println("******************************************************************");
        logger.info("Calculator started");
        boolean cont = true;

        while(cont) {
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural log");
            System.out.println("4. Power function");
            System.out.println("5. Exit");

            int option;

            try {
                option = sc.nextInt();
            } catch (InputMismatchException exp) {
                logger.error("Invalid input at option :: " + exp);
                return;
            }

            int c;

            if(option == 5) {
                cont = false;
            } else {
                System.out.print("Input value : ");
                int value;

                try {
                    value = sc.nextInt();
                    logger.info("Input value : " + value);
                } catch (InputMismatchException exp){
                    logger.error("Invalid input at value1 :: " + exp);
                    return;
                }

                switch (option) {
                    case 1:
                        if(value < 0) {
                            System.out.println("Negative number");
                            logger.error("Cannot find roots of negative number ");
                        } else {
                            double ans = squareRoot(value);
                            if(ans == -1) return;
                            System.out.println("Answer : " + ans);
                            logger.info("Answer : " + ans);
                        }
                        break;
                    case 2:

                        if(value < 0) {
                            logger.error("Invalid number for factorial");
                        } else {
                            long inp = factorial(value);
                            System.out.println("Answer : " + inp);
                            logger.info("Answer : " + inp);
                        }


                        break;
                    case 3:
                        double answer;
                        if(value < 0) {
                            System.out.println("NEGATIVE number in input");
                            logger.error("negative input value for natural log");
                        } else {
                            try {
                                answer = natLog(value);
                                System.out.println("Answer : " + answer);
                                logger.info("Answer : "+ answer);
                            } catch(ArithmeticException e) {
                                logger.error("Error for natural log :: " + e);
                                System.out.println("Error for natural log :: " + e);
                            }
                        }

                        break;
                    case 4:
                        System.out.print("Enter power : ");
                        int p = sc.nextInt();

                        if(p < 0) {
                            logger.error("Negative powers not allowed\n");
                            System.out.print("Negative power\n");
                        } else {
                            logger.info("Enter power : " + p);
                            System.out.println("Answer : " + powerFunc(value, p));
                            logger.info("Answer : " + powerFunc(value, p));
                        }

                        break;
                    default:
                        System.out.println("Invalid option");
                        logger.info("Invalid option");
                }




                System.out.print("1. Continue, 2. Exit :: ");
                c = sc.nextInt();
                System.out.println();
                if(c == 2) {
                    logger.info("Calculator closed");
                    System.out.println("Thank you!!\n");
                    cont = false;
                }
            }

        }

    }
}
