package com.Prgs.Functions;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting limit: ");
        int start = s.nextInt();
        System.out.print("Enter the Ending limit: ");
        int end = s.nextInt();

        System.out.println("Strong numbers are :" );
        for (int i = start; i <= end; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
            }
        }
        s.close();
    }

    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return (sum == num);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
