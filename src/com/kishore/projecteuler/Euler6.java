package com.kishore.projecteuler;
import java.util.Scanner;
/**
 * Created by kishorenarendran on 04/08/15.
 */
public class Euler6 {

    public static int search(int a[], int n) {
        for(int i = 0; i < a.length; i ++) {
            if(a[i] == n)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            long sum = 0;
            long sumOfSquares = 0;
            for(int j = 1; j <= n; j++) {
                sum += j;
                sumOfSquares += j*j;
            }
            sum *= sum;
            System.out.println(sum - sumOfSquares);
        }
    }

}
