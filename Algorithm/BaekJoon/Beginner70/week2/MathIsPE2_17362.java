package week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MathIsPE2_17362 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long input = Long.parseLong(bf.readLine()) % 8;
        //8씩 차이가 난다. 8로 나눈 나머지숫자 리턴

        if(input == 1) System.out.println(1);
        else if(input == 0 || input == 2) System.out.println(2);
        else if(input == 3 || input == 7) System.out.println(3);
        else if(input == 4 || input == 6 ) System.out.println(4);
        else if(input == 5 ) System.out.println(5);

        //System.out.print(input == 0 ? 2 : input == 6 ? 4 : input == 7 ? 3 : input);
    }
}
