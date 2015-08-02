package com.kishore.projecteuler;
import java.util.Scanner;
/**
 * Created by kishorenarendran on 02/08/15.
 */
public class Euler2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(int i = 0; i < t; i++) {
            long n = in.nextLong();
            long a = 1;
            long b = 2;
            long sum = 2;
            long c = a + b;
            while(c < n) {
                if(c % 2 == 0) {
                    sum += c;
                }
                a = b;
                b = c;
                c = a + b;
            }
            System.out.println(sum);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
