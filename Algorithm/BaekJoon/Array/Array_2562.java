import java.util.Scanner;

public class Array_2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i =0; i < arr.length; i++)
        {

            arr[i] = sc.nextInt();
        }

        int maxNum = 0;
        int maxNumIndex = 0;

        for(int j = 0; j<arr.length; j++)
        {
            if(maxNum < arr[j])
            {
                maxNum = arr[j];
                maxNumIndex = j+1;
            }
        }
        System.out.println(maxNum);
        System.out.println(maxNumIndex);
    }
}
