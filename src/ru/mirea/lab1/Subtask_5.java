package ru.mirea.lab1;

import java.math.BigInteger;

public class Subtask_5 {
    public static BigInteger factorial(int n){
        BigInteger res = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
           res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(factorial(50000));
    }
}
