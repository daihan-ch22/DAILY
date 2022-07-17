package week3;

import java.math.BigInteger;
import java.util.Scanner;

//숫자 범위 제한을 넘어선 케이스까지 통과해야 100점을 받는다.
//따라서 BigInteger를 사용하여 모든 숫자 범위에 대해 가능하도록 한다.

public class OddSymbols_15964 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        sc.close();

        System.out.println(AT(A, B));
    }
    public static BigInteger AT(BigInteger A, BigInteger B) {
        return (A.add(B)).multiply(A.subtract(B));
    }
}

