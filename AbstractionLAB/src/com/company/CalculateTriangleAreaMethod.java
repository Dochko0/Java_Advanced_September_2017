package com.company;

import java.util.Scanner;

public class CalculateTriangleAreaMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = Double.parseDouble(input.next());
        double height = Double.parseDouble(input.next());
        double area = calcTriangleArea(width, height);
        System.out.printf("Area = %.2f", area);
    }

    private static double calcTriangleArea(double width, double height) {
        return width * height / 2;
    }
}
