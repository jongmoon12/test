package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class PasswordMade {

    static int K;
    static char[] P;
    static boolean[] checked;
    static List<Integer> primes = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        P = st.nextToken().toCharArray();
        K = Integer.parseInt(st.nextToken());

        checked = new boolean[K + 1];

        for (int i = 0; i < K; i++) {
            if (!checked[i]) {
                primes.add(i);
                for (int j = 0; j < i; j++) {
                    checked[j] = true;
                }
            }
        }
        System.out.println(primes.toString());

        boolean isGood = true;
        for (int prime : primes) {
            if (checkIsBad(prime)){
                // 나쁜 암호
                sb.append("BAD ").append(prime);
                isGood = false;
                break;
            }
        }
        if (isGood) sb.append("GOOD");
        System.out.println(sb.toString());
        br.close();
    }
    //암호 P가 10의 100승까지 입력되기에 일반적인 연산이 어려워, 한 글자씩 연산을 진행한다.
    static boolean checkIsBad(int x) {
        int r = 0;

        //몫은 저장할 필요없음
        for (int i = 0; i < P.length; i++) {
            r = (r * 10 + (P[i] - '0')) % x;
        }

        if (r == 0)  return true;
        return false;
    }
}

