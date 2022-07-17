package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tax_20492 {
    public static void main(String[] args) throws Exception{

        BufferedReader bf =
                new BufferedReader(new InputStreamReader(System.in));
        int prize = Integer.parseInt(bf.readLine());
        bf.close();

        int case1 = prize - (int)(prize*0.22);
        int case2 = (int) (prize - ((prize - (int)(prize * 0.8)) * 0.22));

        System.out.printf("%d %d", case1, case2);
    }
}
