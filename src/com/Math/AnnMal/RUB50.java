package com.Math.AnnMal;

import java.util.Scanner;

/**
 * Created by Ann on 26.11.16.
 * 10,5,2,1
 */
public class RUB50 {
    int MY_MONEY = 50;

    public static void main(String[] args) {
        new RUB50().run();
    }

    public void run() {
        System.out.print("Odd money: ");
        try {
            Scanner sc = new Scanner(System.in);
            int i1 = 0, i2 = 0, i5 = 0, i10 = 0;
            int m = sc.nextInt();
            if ((0 < m) && (m < MY_MONEY)) {
                i10 = (int) m / 10;
                m = m - 10 * i10;
                i5 = (int) m / 5;
                m = m - 5 * i5;
                i2 = (int)m / 2;
                i1 = (m % 2);
                System.out.println(i10+" "+ i5 + " " + i2 + " " + i1);
            } else {
                System.out.println("Value mast be in range (0..50)");
            }
        } catch (Exception e) {
            System.out.println("Error data");
        }
        System.out.println();
    }
}
