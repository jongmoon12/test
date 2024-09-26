package Quiz;

public class Q4 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 0;
        // 1~100 가지중 소수를 구하지만 1은 소수가 아니니 2부터 시작
        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k <= i; k++) {
                if (i != k && i % k == 0) break;
                {
                    if (i == k) {
                        j++;
                        sum = sum + i;
                    }
                }
            }
        }
        System.out.println(j);
        System.out.println(sum);
    }
}

