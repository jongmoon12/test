package Quiz;

public class Q8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Math.pow(2, i); // 2의 i제곱 을 sum 에 더한다
        }
        System.out.println(sum);
    }
}
