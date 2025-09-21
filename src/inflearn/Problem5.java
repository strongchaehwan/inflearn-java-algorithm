package inflearn;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        char[] s = string.toCharArray();

        int lt = 0;
        int rt = s.length - 1;

        String str = "";

        while (lt < rt) {
            if (!((s[lt] >= 'a' && s[lt] <= 'z') || (s[lt] >= 'A' && s[lt] <= 'Z'))) {
                lt++; // 왼쪽이 알파벳 아니면 패스
            } else if (!((s[rt] >= 'a' && s[rt] <= 'z') || (s[rt] >= 'A' && s[rt] <= 'Z'))) {
                rt--; // 오른쪽이 알파벳 아니면 패스
            } else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            str = String.valueOf(s);
        }

        System.out.println(str);

    }
}
