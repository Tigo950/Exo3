package com.controle.tdd;

public class FizzBuzz {
    public static String de(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(n);
    }
}
