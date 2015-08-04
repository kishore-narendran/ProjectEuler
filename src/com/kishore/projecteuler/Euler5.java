package com.kishore.projecteuler;
import java.util.Scanner;
/**
 * Created by kishorenarendran on 04/08/15.
 */
public class Euler5 {
    public static int gcd(int x, int y) {
        int a = x >= y ? x : y;
        int b = x < y ? x : y;
        for(int i = b; i > 1 ; i--) {
            if (b % i == 0 && a % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            int lcm = 1;
            for(int j = 2; j <= n; j++) {
                lcm = (lcm / gcd (lcm, j)) * j;
            }
            System.out.println(lcm);
        }
    }

}
