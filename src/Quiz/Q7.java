package Quiz;

public class Q7 {
    public static void main(String[] args) {
        int n = 49;
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double d1 = (double) i / (i + 1);
            sum += d1;
        }
        System.out.println(sum);
    }
}
