package com.kishore.projecteuler;
import java.util.Scanner;
/**
 * Created by kishorenarendran on 04/08/15.
 */
public class Euler4 {
    public static boolean checkPalindrome(int n) {
        int n1 = n;
        int rev = 0;
        while(n1 > 0) {
            rev *= 10;
            rev += n1 % 10;
            n1 /= 10;
        }
        if(rev == n)
            return true;
        else
            return false;
    }
    public static boolean checkProductOf3DigitNumbers(int n) {
        for(int i = 100; i <= 999; i++) {
            for(int j = 100; j <= 999; j++) {
                if(i * j == n)
                    return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();

            for(int j = n; j > 100000; j--) {
                if(checkPalindrome(j) && checkProductOf3DigitNumbers(j)) {
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}
