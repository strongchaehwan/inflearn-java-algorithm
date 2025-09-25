package inflearn;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toLowerCase();

//        String revered = new StringBuilder(str).reverse().toString();
//
//        if(str.equals(revered)){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

        System.out.println(solution(str));

    }

    public static String solution(String str) {
        String answer = "YES";
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }


        return answer;
    }
}
