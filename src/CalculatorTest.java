import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("inside before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
    }


    @Test
    public void add() {
        //arrange
        int expected=5;
        //act
        Calculator calculator=new Calculator();
        int res=calculator.add(2,3);

        //assert
        assertEquals(expected,res);
    }
}