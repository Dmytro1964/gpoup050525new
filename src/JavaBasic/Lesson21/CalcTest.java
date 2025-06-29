package JavaBasic.Lesson21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {


    @Test
    void testSum(){

        Calc calc = new Calc();

        int expected = 25;
        int actual = calc.sum(10,15);

        assertEquals(expected,actual);
    }

}