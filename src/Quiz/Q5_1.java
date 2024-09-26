package Quiz;

public class Q5_1 {
    public static void main(String[] args) {
        int sum = 0;
        int mi = -1;
        for (int i = 1; i <= 100; i++) {
            if (i == 2) mi = -1;
            sum += i * (mi *= -1);
        }
        System.out.println(sum);
    }
}
