package com.kishore.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kishorenarendran on 05/08/15.
 */
public class Euler8 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String input = br.readLine();
            int n = Integer.parseInt(input.substring(0, input.indexOf(' ')));
            int k = Integer.parseInt(input.substring(input.indexOf(' ') + 1, input.length()));
            String number = br.readLine();
            int numbers[] = new int[n];
            for(int j = 0; j < number.length(); j++) {
                numbers[j] = Character.getNumericValue(number.charAt(j));
            }
            long max = 0;
            for(int y = 0; y < n - k; y++) {
                long product = 1;
                for(int z = y; z < y + k; z++) {
                    product *= numbers[z];
                }
                if(product > max)
                    max = product;
            }
            System.out.println(max);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
