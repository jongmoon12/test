package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AFC {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 총 골 수
        int B = Integer.parseInt(st.nextToken()); // 골 차이

        // 첫 번쨰 합이 골
        // 두 번째는 골 수 차이
        // 출력은 경기 결과 ex) 5 3 은 총 5골 에서 3골차 = 4 : 1
        if (A < B || (A + B) % 2 != 0) {
            System.out.println(-1);
        } else {
            int score1 = (A + B) / 2; // 첫 번째 팀의 골 수
            int score2 = score1 - B; // 두 번째 팀의 골 수
            System.out.println(score1 + " " + score2);
        }
    }
}
