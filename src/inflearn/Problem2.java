package inflearn;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] charArray = str.toCharArray();

        String result = "";

        for (char x : charArray) {
            // 소문자면 대문자로 변환
            if (Character.isLowerCase(x)) {
                result = result + Character.toUpperCase(x);
            }

            // 대문자면 소문자로 변환
            if (Character.isUpperCase(x)) {
                result = result + Character.toLowerCase(x);
            }
        }

        System.out.println(result);
    }
}
