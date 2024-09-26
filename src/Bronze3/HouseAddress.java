package Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HouseAddress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = br.readLine()) != null && !input.equals("0")) {
            int total = 2; // 양쪽에 1칸씩 추가

            for (int i = 0; i < input.length(); i++) {
                char digit = input.charAt(i);
                switch (digit) {
                    case '1':
                        total += 2; // 1은 2칸
                        break;
                    case '0':
                        total += 4; // 0은 4칸
                        break;
                    default:
                        total += 3; // 나머지 숫자(2~9)는 3칸
                        break;
                }
                total++; // 각 숫자 사이에 1칸 추가
            }

            total--; // 마지막 숫자 뒤에는 추가 공간을 더하지 않기 위해 빼줍니다.
            System.out.println(total);
        }
    }
}
