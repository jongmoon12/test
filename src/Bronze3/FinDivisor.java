package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FinDivisor {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int primeCount = 0; // 소수의 개수를 저장할 변수

        for (int i = 1; i <= N; i++) {
            int M = Integer.parseInt(st.nextToken());
            if (isPrime(M)) {
                primeCount++; // 소수인 경우 카운트 증가
            }
        }
        System.out.println(primeCount);
    }

    public static boolean isPrime(int M) {
        if (M < 2) return false;

        for (int i = 2; i * i <= M; i++) {
            if (M % i == 0) {
                return false;
            }

        }
        return true;
    }
}
