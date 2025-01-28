package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inputScan = new Scanner(System.in);
        int totalElements = Integer.parseInt(inputScan.nextLine());
        String lineInput = inputScan.nextLine();
        ArrayList<Integer> arr1 = Arrays.stream(lineInput.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        int queryCount = Integer.parseInt(inputScan.nextLine());

        while (queryCount > 0) {
            String op = inputScan.nextLine(); // Read operation type

            switch (op) {
                case "Insert":
                    String[] vals = inputScan.nextLine().split(" ");
                    int index = Integer.parseInt(vals[0]);
                    int value = Integer.parseInt(vals[1]);
                    arr1.add(index, value);
                    break;

                case "Delete":
                    int dltIndex = Integer.parseInt(inputScan.nextLine());
                    arr1.remove(dltIndex);
                    break;
            }
            queryCount--;
        }
        inputScan.close();
        arr1.forEach(x -> System.out.print(x + " "));
    }
}

