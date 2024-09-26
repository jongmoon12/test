package Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AiWatch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hr = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        sec += time % 60;
        min += (time / 60) % 60;
        hr += (time / 3600) % 24;
        
        if (sec >= 60) {
            sec -= 60;
            min++;
        }
        if (min >= 60) {
            min -= 60;
            hr++;
        }
        if (hr >= 24) {
            hr -= 24;
        }

        System.out.println(hr + " " + min + " " + sec);
    }
}
