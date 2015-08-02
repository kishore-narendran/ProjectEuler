package com.kishore.projecteuler;
import java.util.Scanner;
/**
 * Created by kishorenarendran on 02/08/15.
 */
public class Euler1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long i = 0; i < t; i++) {
            long n = in.nextLong();
            long sum3, sum5, sum15;
            long a = 0;
            if(n < 3) {
                sum3 = 0;
            }
            else {
                long l3 = (n - 1) - ((n - 1) % 3);
                long n3 = (long)(((l3 - a) / 3.0) + 1);
                sum3 = (long)((n3 / 2.0) * ((n3 - 1) * 3.0));
            }


            if(n < 5) {
                sum5 = 0;
            }
            else {
                long l5 = (n - 1) - ((n - 1) % 5);
                long n5 = (long)(((l5 - a) / 5.0) + 1);
                sum5 = (long)((n5 / 2.0) * ((n5 - 1) * 5.0));
            }


            if(n < 15) {
                sum15 = 0;
            }
            else {
                long l15 = (n - 1) - ((n - 1) % 15);
                long n15 = (long)(((l15 - a) / 15.0) + 1);
                sum15 = (long)((n15 / 2.0) * ((n15 - 1) * 15.0));
            }

            System.out.println(sum3 + sum5 - sum15);
        }
    }
}
