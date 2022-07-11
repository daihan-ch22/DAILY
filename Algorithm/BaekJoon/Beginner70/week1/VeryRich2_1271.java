package week1;

import java.math.BigInteger;
import java.util.Scanner;

public class VeryRich2_1271 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger total_money = sc.nextBigInteger();
        BigInteger numberOfEntities = sc.nextBigInteger();
        sc.close();

            System.out.println(total_money.divide(numberOfEntities));
            System.out.println(total_money.remainder(numberOfEntities));

    }
}
