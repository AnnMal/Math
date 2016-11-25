package com.Math.AnnMal;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by Ann on 25.11.16.
 */
public class SumInt {
    public static void main(String[] args) {
        int I1 = 0;
        int I2 = 0;
        int I3 = 0;
        out.println("Input 3 integer: ");
        Scanner sc;
        sc = new Scanner(System.in);
        try {
            I1 = sc.nextInt();
            I2 = sc.nextInt();
            I3 = sc.nextInt();
            if ((I1+I2==I3)|(I1+I3==I2)|(I2+I3==I1)) {
                out.println("YES");
            } else out.println("NO");
            out.println(I1+" "+I2+" "+I3);

        } catch (Exception e) {
            out.println("Error data");
        }
    }

}
