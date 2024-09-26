package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PhoneBill {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }

        int Y_total = 0;
        int M_total = 0;

        for (int i = 0; i < N; i++) {
            Y_total += (times[i] / 30 + 1) * 10;
        }
        for (int i = 0; i < N; i++) {
            M_total += (times[i] / 60 + 1) * 15;
        }

        if (Y_total < M_total) {
            System.out.println("Y " + Y_total);
        } else if (M_total < Y_total) {
            System.out.println("M " + M_total);
        } else {
            System.out.println("Y M " + Y_total);
        }
    }
}


