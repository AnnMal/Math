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
            int I1 = 0, I2 = 0, I5 = 0, I10 = 0;
            int M = sc.nextInt();
            if ((0 < M) && (M < MY_MONEY)) {
                I10 = (int) M / 10;
                System.out.print(I10 + " ");
                M = M - 10 * I10;
                I5 = (int) M / 5;
                System.out.print(I5 + " ");
                M = M - 5 * I5;
                I2 = (int)M / 2;
                System.out.print(I2 + " ");
                I1 = (M % 2);
                System.out.print(I1 + " ");
            } else {
                System.out.print("Value mast be in range (0..50)");
            }
        } catch (Exception e) {
            System.out.print("Error data");
        }
    }
}
