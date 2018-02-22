package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class CombinationCount {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Integer n = Integer.parseInt(scan.nextLine());
        Integer k = Integer.parseInt(scan.nextLine());

        Long x = binomial(n, k);

        System.out.printf("%d%n", x);
    }

    private static long binomial(int n, int k) {
        if (k > n - k)
            k = n - k;

        long b = 1;
        for (int i = 1, m = n; i <= k; i++, m--)
            b = b * m / i;
        return b;
    }
}
