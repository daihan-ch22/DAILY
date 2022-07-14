package week2;

import java.util.Scanner;

public class LeaderIsGone_15727 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        sc.close();

        //1분에 1에서 5만큼 이동가능
        //5씩 빼가면서
        //카운트에 다 더하기
        int count = 0;
        int remaining = distance;

        if (distance >= 5) {
            while (remaining >= 5) {;
                remaining -= 5;
                count++;
            } //while을 빠져나오면 5이하인 수가 남게되는데 1~5까지 1분이므로
            //count에 하나만 더 추가하면 된다.
        }
        if(remaining<5 && remaining !=0){
            //다만 5로 나눠떨어지는 경우는 제외해야하므로,
            //remaining이 0이 아닐때만 더한다.
            count++;
        }
        System.out.println(count);
    }
}
