package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AveragePoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] point = new int[5];
        int sum = 0;
        for (int i = 0; i < 5 ; i++) {
          int input = Integer.parseInt(br.readLine());
            if (input < 40) {
                point[i] = 40; // 입력값이 40 이하면 40으로 설정
            } else {
                point[i] = input; // 입력값이 40보다 크면 그대로 설정
            }
            sum += point[i]; // 입력받은 점수를 합계에 더함
        }
        System.out.println(sum/5); // 합계를 5로 나눔
        }


    }
