package com.runningsnail.wowweather;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author yongjie created on 2019-08-09.
 */
public class GameNumberTest {

    @Test
    public void should_say_1_when_value_is_1() {
        assertGameNumber("1", 1);
    }


    @Test
    public void should_say_fizz_when_value_is_divderable_by_3() {
        assertGameNumber("fizz", 3);
    }


    @Test
    public void should_say_buzz_when_value_is_divderable_by_5() {
        assertGameNumber("buzz", 5);
    }

    @Test
    public void should_say_buzz_when_value_is_divderable_by_15() {
        assertGameNumber("fizzbuzz", 15);
    }


    private void assertGameNumber(String expect, int value) {
        GameNumber gameNumber = new GameNumber(value);
        Assert.assertEquals(expect, gameNumber.say());
    }
}
