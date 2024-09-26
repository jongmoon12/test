package Quiz;

public class S7_1 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5 + i; j++) {
                if (j >= 4 - i) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 0; j < 9 - i; j++) {
                if (j >= i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
