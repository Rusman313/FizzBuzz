package LeapYear;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
    LeapYear LY = new LeapYear();
    @Test
    public void isYearDivisibleBy4(){
      
        Assert.assertEquals(true, LY.isLeapYear(1996));
    }

    @Test
    public void YearIsNotDivisibleBy100UnlessDivisibleBy400Also(){
        Assert.assertEquals(true, LY.isLeapYear(2000));
        Assert.assertEquals(false, LY.isLeapYear(1900));

    }


    @Test
    public void isALeapYear(){
        Assert.assertEquals(false, LY.isLeapYear(1900));
        Assert.assertEquals(true, LY.isLeapYear(2000));
        Assert.assertEquals(false, LY.isLeapYear(2001));
        Assert.assertEquals(true, LY.isLeapYear(1996));

    }
}