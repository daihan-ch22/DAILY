package week2;

import java.util.*;
public class HanwahSong_14652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        System.out.println(K/M + " " + K%M);

        //실패
        /*int fillCount = 0;
        int Ncount = 0;
        int Mcount = 0;

        do{
            if(Mcount == M){
                Mcount = 0;
                Ncount++;
            }
            Mcount++;
            fillCount++;

        }while(fillCount != K);

        System.out.printf("%d %d", Ncount, Mcount);*/


        /*
        메모리 초과
        for(int i =0; i< N; i++){
            for(int j=0; j<M; j++){
                if(fillCount == K) {
                    System.out.printf("%d %d",i, j);
                }
                matrix[i][j] = fillCount;
                fillCount++;
            }
        }*/

    }
}
