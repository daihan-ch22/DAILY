package week3;

import java.io.*;

public class TestResult_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = Integer.parseInt(bf.readLine());
        bf.close();

        bw.write(
                (result >= 90 && result <=100) ? "A" :

                        (result >=80 && result < 90) ? "B" :

                                (result >=70 && result < 80) ? "C" :

                                        (result >= 60 && result < 70) ? "D" :

                                                "F" );

        bw.flush();
        bw.close();
    }
}
