
import static org.junit.Assert.*;
import org.junit.Test;

public class testCalc {
    private static final double DELTA = 1e-15;
    calc calculator;

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, calc.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calc.factorial(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calc.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calc.factorial(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calc.powerFunc(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 64, calc.powerFunc(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calc.powerFunc(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calc.powerFunc(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calc.natLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calc.natLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calc.natLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calc.natLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, calc.squareRoot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, calc.squareRoot(1), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calc.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calc.squareRoot(4), DELTA);

    }


}