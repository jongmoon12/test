package Quiz;

public class Q6 {
    public static void main(String[] args) {
        int[] sum = {1, 2, 4, 7, 11, 16, 22, 29, 37, 46};

        int all = 0;
        for(int num : sum){
            all += num;
        }
        System.out.println(all);
    }
}
