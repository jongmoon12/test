package Quiz;

public class Q2 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
                j++;
            }
        }
        System.out.println(j);
        System.out.println(sum);
    }
}

