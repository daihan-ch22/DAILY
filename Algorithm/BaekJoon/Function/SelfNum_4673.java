public class SelfNum_4673 {
    public static void main(String[] args) {

        boolean[] ans = new boolean[10001];

        //Boolean 배열 - SelfNumber가 아닌 경우 해당 수에 대한 배열에 인덱스에 true값 넣기.
        for (int i = 0; i < 10001; i++) {

            int num = SelfNum(i);

            if (num < 10001) {
                ans[num] = true;
            }
        }

        for(int q = 0; q < 10001; q++) //해당 인덱스값이 SelfNumber인 경우에만 출력
        {
            if(ans[q] != true)
            {
                System.out.println(q);
            }
        }
    }


    public static int SelfNum(int number) {
        int x = number;

        //1234
        //1234 + 1 + 2 + 3 + 4
        // 10으로 나눠가면서 줄임
        while (number != 0) {
            x = x + (number % 10); //1의자리수 똑 떼기
            number = number / 10; // 자리수 줄이기

        }
        return x;
    }
}





