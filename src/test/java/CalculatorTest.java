import calculator.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-7;
    calculator calc = new calculator();

    @Test
    public void sqrtTP(){
        assertEquals("Square root - TP",2, calc.sqt(4), DELTA);
        assertEquals("square_root - TP",4, calc.sqt(16), DELTA);
    }

    @Test
    public void sqrtFP(){
        assertNotEquals("square_root - FP ",3,calc.sqt(7), DELTA);
        assertNotEquals("square_root - FP",2,calc.sqt(10), DELTA);
    }

    @Test
    public void factTP(){
        assertEquals("Fact - TP ",1,calc.factorial(1), DELTA);
        assertEquals("Fact - TP",720,calc.factorial(6.0), DELTA);
    }

    @Test
    public void factFP(){
        assertNotEquals("Fact - FP ",3,calc.factorial(2), DELTA);
        assertNotEquals("Fact - FP ",10,calc.factorial(5.0), DELTA);
    }

    @Test
    public void logTP(){
        assertEquals("log - TP",1.6094379124341003,calc.log(5),DELTA );
        assertEquals("log - TP ", 0, calc.log(1), DELTA );
    }

    @Test
    public void logFP(){
        assertNotEquals("log - FP ",1,calc.log(10),DELTA );
        assertNotEquals("log - FP",1,calc.log(120),DELTA );
    }

    @Test
    public void powerTP(){
        assertEquals("Power - TP ",1,calc.power(1,3),DELTA);
        assertEquals("Power - TP ",0.0625,calc.power(0.5,4),DELTA);
    }

    @Test
    public void powerFP(){
        assertNotEquals("Power - FP ",0,calc.power(1,0),DELTA);
        assertNotEquals("Power - FP ",1,calc.power(-1.1,5),DELTA);
        assertNotEquals("Power - FP ",-1,calc.power(-1,2),DELTA);
    }
}