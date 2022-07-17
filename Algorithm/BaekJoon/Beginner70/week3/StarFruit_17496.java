package week3;

import java.util.Scanner;

public class StarFruit_17496 {
    public static void main(String[] args) {
        // 씨앗이 자라는데 T 일
        // i 일에 씨앗을 심으면 i + T 일에 수확 가능 / 같은칸에 바로 씨앗 심을 수 있음
        // 빈칸이 C개 / 1칸에 과일 하나
        // 오늘은 1일 - N일까지 여름 지속 (N일 이전에 수확해야함)
        // 스타후르츠 하나당 P원

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 여름의 일 수
        int T = sc.nextInt(); // 재배 소요 일 수
        int C = sc.nextInt(); // 재배 칸 수
        int P = sc.nextInt(); // 과일 개당 가격
        sc.close();

        System.out.println(StarFruit(N,T,C,P));
    }
    public static int StarFruit(int N, int T, int C, int P) {

        //씨앗 재배
        int period = 1 + T; //오늘 날짜(1일) + 재배에 걸리는 일을 더한다.
        int harvest = 0;    //수확물 개수

        while (period <= N) {
            //여름 기간안에 수확하면 재배한 칸 수만큼 수확물 수를 더한다.
            harvest += C;

            //현재 재배에 걸렸던 일수 + 한번더 싸이클을 돌기위한 T를 현재 period에 더해본다.
            //여름 범위를 넘어서면 저절로 while을 벗어날 것
            period += T;
        }
        return harvest * P;
    }
}

