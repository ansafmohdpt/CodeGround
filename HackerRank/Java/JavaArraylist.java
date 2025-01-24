package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inputScan = new Scanner(System.in);
        int totalLines = inputScan.nextInt();
        inputScan.nextLine(); // Consume the leftover newline
        List<ArrayList<Integer>> parentList = new ArrayList<>();
        for (int i = 0; i < totalLines; i++) {
            String lineEntry = inputScan.nextLine();
            String[] lineEntries = lineEntry.split(" ").clone();

            int lineSize = Integer.parseInt(lineEntries[0]);
            ArrayList<Integer> lineList = new ArrayList<Integer>();
            for (int j = 1; j <= lineSize; j++) {
                lineList.add(Integer.parseInt(lineEntries[j]));
            }
            parentList.add(lineList);
        }
        int queryCount = inputScan.nextInt();
        inputScan.nextLine(); // Consume the leftover newline
        for (int i = 0; i < queryCount; i++) {
            String queryEntry = inputScan.nextLine();
            List<Integer> queryPos = Arrays.stream(queryEntry.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            try {
                System.out.println(parentList.get(queryPos.get(0) - 1).get(queryPos.get(1) - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
