import java.util.Scanner;
/// 테스트 케이스는 한줄로 이루어져 있다!!!!!!

public class Array_8958 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String arr[] = new String[sc.nextInt()];

        //배열에 string 하나씩 떼서 넣는다.
        for(int j=0; j<arr.length; j++)
        {
            arr[j] = sc.next();
        }

        sc.close();


        for(int i=0; i<arr.length; i++) //테스트 케이스 개수
        {

            int points = 0; //점수
            int totalPoints = 0;

            //배열 순회 & OX 개수 판별
            for(int q = 0; q<arr[i].length(); q++)
            {
                if(arr[i].charAt(q) == 'O')
                {
                    ++points;

                } else {
                    points = 0;
                }

                totalPoints += points;
            }
            System.out.println(totalPoints);
        }

    }
}
