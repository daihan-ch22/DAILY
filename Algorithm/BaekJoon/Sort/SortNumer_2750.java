import java.util.*;
public class SortNumer_2750 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int temp = 0;

        for(int i=0; i<num; i++)  //배열에 입력값 넣기
        {
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<arr.length; i++)
        {
            for(int j =i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
