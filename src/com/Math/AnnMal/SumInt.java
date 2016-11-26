package com.Math.AnnMal;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by Ann on 25.11.16.
 */
public class SumInt {
    public static void main(String[] args) {
        new SumInt().run();
    }

    public void run() {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        out.println("Input 3 integer: ");
        Scanner sc;
        sc = new Scanner(System.in);
        try {
            i1 = sc.nextInt();
            i2 = sc.nextInt();
            i3 = sc.nextInt();
            if ((i1+i2==i3)|(i1+i3==i2)|(i2+i3==i1)) {
                out.println("YES");
            } else out.println("NO");
            //out.println(i1+" "+i2+" "+i3);

        } catch (Exception e) {
            out.println("Error data");
        }
        System.out.println();
    }
}
