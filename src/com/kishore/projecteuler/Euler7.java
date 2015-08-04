package com.kishore.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kishorenarendran on 04/08/15.
 */
public class Euler7 {
    public static boolean checkPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int primePosition[] = new int[t];
        int maxPosition = 1;
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            primePosition[i] = n;
            if(n > maxPosition)
                maxPosition = n;
        }
        long primeNumbers[] = new long[maxPosition];
        long testNumber = 2;
        int count = 1;
        while(count <= maxPosition) {
            if(checkPrime(testNumber)) {
                primeNumbers[count] = testNumber;
                count++;
            }
            testNumber++;
        }
        for(int i = 0; i < primePosition.length; i++) {
            System.out.println(primeNumbers[primePosition[i]]);
        }
    }
}
