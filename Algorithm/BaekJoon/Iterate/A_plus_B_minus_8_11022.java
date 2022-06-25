import java.util.*;

public class A_plus_B_minus_8_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        int A = 0;
        int B = 0;

        for (int i = 1; i<=caseNum; i++) {

            A = sc.nextInt();
            B = sc.nextInt();

            System.out.printf("Case #%d: %d + %d = %d", i, A, B, A+B);
            System.out.println();

        }
    }
}
