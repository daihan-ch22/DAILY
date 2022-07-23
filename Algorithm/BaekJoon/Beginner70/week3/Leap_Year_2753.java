package week3;

import java.util.Scanner;

public class Leap_Year_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        sc.close();

        if( ((years % 4 == 0) && (years%100 != 0)) || (years%400 == 0) )
            System.out.println(1);
        else
            System.out.println(0);

    }
}
