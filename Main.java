package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = 1;
        int i,j,n ;

        System.out.print("input nilai n : ");
        n = sc.nextInt()/2;
        //kodingan ketupat
        for (i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print("0");
            }
            for ( j = 1; j <= l; j++) {
                System.out.print("*");
            }
            l += 2;
            System.out.println("");
        }
        l -= 4;
        for ( i = (n - 1); i >= 1; i--) {
            for (int k = i; k <= (n - 1); k++) {
                System.out.print("0");
            }
            for ( j = l; j >= 1; j--) {
                System.out.print("*");
            }
            l -= 2;
            System.out.println("");
        }
    }
}
