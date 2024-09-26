package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VacationHomework {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int VacationDays = Integer.parseInt(br.readLine()); // 총 방학일
        int LeftKoreanPage = Integer.parseInt(br.readLine());
        int LeftMathPage = Integer.parseInt(br.readLine());
        int MaxKoreanPage = Integer.parseInt(br.readLine());
        int MaxMathPage = Integer.parseInt(br.readLine());

        if ((LeftKoreanPage % MaxKoreanPage) == 0) {
            LeftKoreanPage = LeftKoreanPage / MaxKoreanPage;
        } else {
            LeftKoreanPage = (LeftKoreanPage / MaxKoreanPage) + 1;
        }
        if ((LeftMathPage % MaxMathPage) == 0) {
            LeftMathPage = LeftMathPage / MaxMathPage;
        } else {
            LeftMathPage = (LeftMathPage / MaxMathPage) + 1;
        }

        if (LeftKoreanPage > LeftMathPage) {
            System.out.println(VacationDays - LeftKoreanPage);
        } else {
            System.out.println(VacationDays - LeftMathPage);
        }

    }
}

