package com.Math.AnnMal;

import java.util.Scanner;

/**
 * Created by Ann on 26.11.16.
 */
public class Brick {
    public static void main(String[] args) {

    }

    public void run() {
        System.out.print("A B C and D = ");
        Scanner sc = new Scanner(System.in);
        try {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            float d = sc.nextFloat();
            float r = 2 * d;
            float ab = (float) Math.sqrt(a*a+b*b);
            float bc = (float) Math.sqrt(b*b+c*c);
            float ac = (float) Math.sqrt(a*a+c*c);
            if ((ab<r)|(bc<r)|(ac<r)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } catch (Exception e) {
            System.out.println("Error data");
        }
        System.out.println();
    }
}
