package br.com.xti.logica;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        int a = 0;
        int b = 1;

        for (int i=0; i<=n; i++) {
            int soma = a+b;
            System.out.println(a + " + " + b + " = " + soma);
            a = b;
            b = soma;
        }
    }
}