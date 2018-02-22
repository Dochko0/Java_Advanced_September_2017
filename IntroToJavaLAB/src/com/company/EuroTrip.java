package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double quantity= Double.parseDouble(input.nextLine());
        BigDecimal priceBg= new BigDecimal(quantity*1.20);

        BigDecimal mark = new BigDecimal("4210500000000");
        BigDecimal price = mark.multiply(priceBg);


        System.out.printf("%.2f marks", price);


    }
}
