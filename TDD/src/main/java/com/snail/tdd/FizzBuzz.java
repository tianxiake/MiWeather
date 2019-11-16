package com.snail.tdd;

/**
 * @author yongjie created on 2019-08-12.
 */
class FizzBuzz {
    private String value;

    public FizzBuzz(String value) {
        this.value = value;
    }


    public String say() {
        if (isDivider("3") && isDivider("5")) {
            return "fizzbuzz";
        }
        if (isDivider("3")) {
            return "fizz";
        }
        if (isDivider("5")) {
            return "buzz";
        }
        return value;
    }

    private boolean isDivider(String value) {
        return Integer.parseInt(this.value) % Integer.parseInt(value) == 0;
    }
}
