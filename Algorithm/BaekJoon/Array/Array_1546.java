import java.util.Arrays;
import java.util.Scanner;
public class Array_1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfTests = sc.nextInt();
        double[] tests = new double[numOfTests];

        double M = 0;


        for(int t = 0; t < tests.length; t++) // 배열에 시험 점수 각각 입력하기
        {
            tests[t] = sc.nextInt();
        }

        for(int i = 0; i < tests.length; i++) { // 최댓값 M 구하기
            if (M < tests[i]) {
                M = tests[i];
            }
        }


        for(int j = 0; j<tests.length; j++) { // 배열의 값을 수식대로 바꾸기
            tests[j] = tests[j] / M * 100;
        }

        //평균 계산
        System.out.println
                (
                Arrays.stream(tests).average().orElse(0.0)
                );
    }
}


