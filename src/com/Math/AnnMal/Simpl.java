package com.Math.AnnMal;

import java.util.Scanner;

/**
 * Created by Ann on 26.11.16.
 */
public class Simpl {
    public static void main(String[] args) {
        new Simpl().run();
    }

    public void run() {
        try {
            System.out.print("I'm waiting integer value [1..1000]: ");
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            boolean b;
            if ((m > 0)&&(m < 1001)) {
                for (int i = 2; i <= m; i++) {
                    b = false;
                    for (int j = 2; j < i; j++) {
                        if ((i % j)==0) {
                            b = true; break;
                        }
                    }
                    if (b==false) {
                        System.out.print(i+" ");
                    }
                }
            } else {
                System.out.print("Value mast be [1..1000]");
            }
        } catch (Exception e) {
            System.out.print("Error data");
        }
    }

}
