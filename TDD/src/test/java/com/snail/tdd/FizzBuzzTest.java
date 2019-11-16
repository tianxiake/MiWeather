package com.snail.tdd;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author yongjie created on 2019-08-12.
 */
public class FizzBuzzTest {

    @Test
    public void test_return_raw_value_in_normal_value() {
        checkFizzBuzz("1", "1");
    }

    @Test
    public void test_return_fizz_if_divider_by_3() {
        checkFizzBuzz("fizz", "3");
    }

    @Test
    public void test_return_buzz_if_divider_by_5() {
        checkFizzBuzz("buzz", "5");
    }


    @Test
    public void test_return_fizzbuzz_if_divider_by_3_and_divider_by_5() {
        checkFizzBuzz("fizzbuzz", "15");
    }


    public void checkFizzBuzz(String expect, String value) {
        FizzBuzz fizzBuzz = new FizzBuzz(value);
        String say = fizzBuzz.say();
        Assert.assertThat(expect, Is.is(say));
    }
}
