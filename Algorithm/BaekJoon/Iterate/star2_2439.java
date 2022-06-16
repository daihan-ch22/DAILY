import java.util.Scanner;

public class star2_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        sc.close();
        //row = 5


        for(int i=1; i<=row; i++)
        {
            for(int j = 1; j<=row-i; j++)
            {
                System.out.print(" ");
            }

            for(int k = 0; k<i; k++)
            {
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}
