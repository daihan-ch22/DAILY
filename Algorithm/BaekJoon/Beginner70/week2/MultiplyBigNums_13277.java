package week2;

import java.math.BigInteger;
import java.util.Scanner;
public class MultiplyBigNums_13277 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        sc.close();

        System.out.println(A.multiply(B));
    }
}
