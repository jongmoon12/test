package Quiz;

public class Q4_1 {
    public static void main(String[] args) {
        // 소수를 판단하기 위한 변수
        boolean jdg = true;
        int cnt = 0;
        int tot = 0;
        // 1을 제외한 2부터 100까지 숫자 반복(1은 소수가 아니므로 제외)
        for (int i = 2; i <= 100; i++) {
            // 1과 자기자신을 제외한 숫자 반복
            for (int j = 2; j < i; j++) {
                // 소수 판단 처리
                if (i % j == 0) {
                    jdg = false;
                    break;
                }
            }
            // 소수 확인
            if (jdg) {
                cnt++;
                tot += i;
            }
            // 소수판단 변수 초기화
            jdg = true;
        }
        System.out.println(cnt);
        System.out.println(tot);
    }
}
