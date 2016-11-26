package com.Math.AnnMal;

import java.util.Scanner;

/**
 * Created by Ann on 26.11.16.
 * 10,5,2,1
 */
public class RUB50 {
    public static void main(String[] args) {
        System.out.print("Odd money: ");
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        if ((0 < M)&&(M < 50)) {
            System.out.print((int)50/M);
        } else {
            System.out.print("Value mast be in range (0..50)");
        }
    }
}
