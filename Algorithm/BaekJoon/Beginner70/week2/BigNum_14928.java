package week2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class BigNum_14928 {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in); //시간초과
        BufferedReader bf =
                new BufferedReader(new InputStreamReader(System.in));

        String N = bf.readLine();
       final int x = 20000303;
       // System.out.println(N.remainder(x));

        //자리수를 하나씩 늘려서 연산해야한다.
        //첫번째 자리부터 x로 나눈후 그 나머지에 10을 곱한다.
        //...반복
        long remain = 0;
        for(int i=0; i<N.length();i++ ){
            remain = (remain*10 + N.charAt(i)-'0') % x;
        }
        System.out.println(remain);
    }
}
