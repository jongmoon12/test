package Bronze4;

import java.io.*;

public class InaRowNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        for (int i = 1; i <= N; i++) {
            String row = String.valueOf(br.readLine());
            bw.write(i + ". " +row + "\n");

        }

        bw.flush();

    }
}
