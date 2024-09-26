package Quiz;

public class Q10 {
    public static void main(String[] args) {
        int sum = 0;
        int n_2 = 0;
        int n_1 = 0;
        int n = 1;

        for (int i = 0; i < 10; i++) {
            if (i == 0) n = 1;
            else {
                n = n_1 + n_2;
            }
            n_2 = n_1;
            n_1 = n;
            sum += n;
        }
        System.out.println(sum);
    }
}