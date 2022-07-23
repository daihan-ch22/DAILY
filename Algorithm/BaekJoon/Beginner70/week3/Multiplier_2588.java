package week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiplier_2588 {
    public static void main(String[] args) throws Exception{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int first_Num = Integer.parseInt(bf.readLine());
        String second_Num = bf.readLine();
        bf.close();

        //1의자리
        int a = first_Num * Character.getNumericValue(second_Num.charAt(2));
        System.out.println(a);
        //10의자리
        int b = first_Num *
                Character.getNumericValue(second_Num.charAt(1));
        System.out.println(b);

        //100의자리

        int c = first_Num * Character.getNumericValue(second_Num.charAt(0));
        System.out.println(c);

        System.out.println(a + (b*10) + (c*100) );

    }
}
