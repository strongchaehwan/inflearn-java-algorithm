package inflearn;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] charArray = str.toCharArray();

        String result = "";
        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                result = result + String.valueOf(c);
            }
        }

        System.out.println(Integer.valueOf(result));
    }
}
