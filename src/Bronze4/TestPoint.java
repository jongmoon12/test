package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int inf1 = Integer.parseInt(st.nextToken());
        int mat1 = Integer.parseInt(st.nextToken());
        int sic1 = Integer.parseInt(st.nextToken());
        int eng1 = Integer.parseInt(st.nextToken());
        int sum1 = inf1 + mat1 + sic1 + eng1;

        st = new StringTokenizer(br.readLine());

        int inf2 = Integer.parseInt(st.nextToken());
        int mat2 = Integer.parseInt(st.nextToken());
        int sic2 = Integer.parseInt(st.nextToken());
        int eng2 = Integer.parseInt(st.nextToken());
        int sum2 = inf2 + mat2 + sic2 + eng2;

        if(sum1 > sum2){
            System.out.println(sum1);
        } else {
            System.out.println(sum2);
        }

    }
}
