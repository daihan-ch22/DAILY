import java.util.Scanner;

public class Array_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();


        for (int i = 0; i < caseNum; i++) {

            int studentNum = sc.nextInt();  //학생 수 입력받기
            if (studentNum >= 1 && studentNum <= 1000) {

                int[] score = new int[studentNum]; //학생 수만큼의 성적 배열

                for (int j = 0; j < studentNum; j++) //학생 수 만큼 성적 입력받기
                {
                    score[j] = sc.nextInt();
                }

                int totalScore = 0;
                for (int k = 0; k < score.length; k++) { // 평균값 구하기 위해 전체 성적 합한 값 더하기

                    if(score[k] >= 0 && score[k] <=100)
                    totalScore += score[k];
                }
                double averageScore = totalScore / score.length; // 평균값 저장

                double overAVG = 0;
                int count = 0;
                for (int q = 0; q < score.length; q++) { // 평균을 넘는 학생수 카운트하기
                    if (score[q] > averageScore) {
                        count++;
                    }
                }
                double ans = (double) count / (double) score.length; // 평균 넘는 학생의 비율 구하기
                overAVG = ans * 100; // %로 표시하기 위해 100 곱하기

                System.out.printf("%.3f%%\n", overAVG);
            }
        }
    }
}