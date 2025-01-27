import java.math.BigDecimal;
import java.util.*;

class BigNumber {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                BigDecimal jth = new BigDecimal(s[j]);
                BigDecimal j1th = new BigDecimal(s[j - 1]);
                if (j1th.compareTo(jth) < 0) {
                    //swap elements
                    String temp = s[j - 1];
                    s[j - 1] = s[j];
                    s[j] = temp;
                }
            }
        }
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}