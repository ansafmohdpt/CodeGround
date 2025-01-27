package Java;

import java.io.*;
import java.util.*;

public class JavaNegativeSubarray {

    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        int arrLength = inputScan.nextInt();
        int[] inputArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            inputArr[i] = inputScan.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < arrLength; i++) {
            int sum = 0;
            for (int j = i; j < arrLength; j++) {
                sum += inputArr[j];
                if (sum < 0) {
                    counter += 1;
                }
            }
        }
        System.out.println(counter);
    }
}