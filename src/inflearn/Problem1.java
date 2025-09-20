package inflearn;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase(); // 문자열 입력 -> 소문자로 변환
        char c = sc.next().toLowerCase().charAt(0); // 특정 문자 입력

        char[] charArray = a.toCharArray(); // String 문자열을 char 배열로 변환

        int count = 0;
        for (char ch : charArray) {
            if (ch == c) {
                count++;
            }
        }

        System.out.println(count);


    }
}
