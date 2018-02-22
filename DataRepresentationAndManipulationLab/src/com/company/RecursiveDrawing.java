package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class RecursiveDrawing {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        printFigure(n);
    }
    static void printFigure(int n) {
        if (n==0){
            return;
        }
        System.out.println(String.join("", Collections.nCopies(n, "*")));

        printFigure(n-1);
        System.out.println(String.join("", Collections.nCopies(n, "#")));
    }
}
