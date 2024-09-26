package BaekJoon;


import java.io.*;
import java.util.Locale;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String a = br.readLine().toUpperCase();
            int count = 0;
            if (a.equals("#")) break;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U')
                    ;
                count++;
            }
        }

    }
}













