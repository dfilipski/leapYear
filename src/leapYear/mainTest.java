package leapYear;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.*;

public class mainTest {

    @Test
    public void testOddYearIsNotLeapYear() {
        boolean result = leapYear.main.isLeapYear(2003);
        Assertions.assertFalse(result);
    }

    @Test
    public void test2016IsLeapYear() {
        boolean result = leapYear.main.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void testDivisibleBy100() {
        boolean result = leapYear.main.isLeapYear(1700);
        Assertions.assertFalse(result);
    }

    @Test
    public void testDivisbleBy400() {
        boolean result = leapYear.main.isLeapYear(2000);
        Assertions.assertTrue(result);
    }
}