package inflearn;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 몇개의 데이터를 입력할지

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

//        for (String x : strings) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            System.out.println(tmp);
//        }

        for (String x : strings) { // ex study
            char[] s = x.toCharArray(); // 문자 배열로 만들기 s t u d y
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {
                char temp = s[lt]; // temp -> s
                s[lt] = s[rt]; // y t u d y
                s[rt] = temp; // y t u d s
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            System.out.println(tmp);

        }


    }
}
