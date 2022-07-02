import java.util.*;

public class Array_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i =0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }sc.close();
        int max = -1000000;
        int min = 1000000;
        for(int q =0; q< arr.length;q++)
        {
            if(arr[q] >= max) max = arr[q];
            if(arr[q] <= min) min = arr[q];
        }
        System.out.printf("%d %d",min,max);
    }
}
