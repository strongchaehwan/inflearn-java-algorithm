package inflearn;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        // ksekkset
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer = answer + str.charAt(i);
            }
        }

        return answer;
    }
}
