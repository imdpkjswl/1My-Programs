package com.iamdj;
import java.lang.String;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        double x = 69;

        double res = Math.sqrt(x);

        res = Math.round(res*100.0)/100.0; //  Round off the res in two decimal point

        System.out.println(res);
    }
}
