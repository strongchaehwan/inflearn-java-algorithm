package inflearn;

import java.util.Scanner;

public class Problem3 {

    public static String solution(String str) {
        String answer = ""; // 가장 긴 단어를 반환 할 값
        int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화시키기

        String[] s = str.split(" "); // 입력 받은 문자열 배열로 쪼개기

        for (String x : s) {
            int len = x.length();

            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(solution(string));

    }
}
