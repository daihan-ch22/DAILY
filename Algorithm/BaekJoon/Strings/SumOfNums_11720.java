import java.math.BigInteger;
import java.util.*;
public class SumOfNums_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input_num = sc.nextInt();
        sc.nextLine();
        sc.reset();
        String number = sc.nextLine();


        int sum = 0;

        for(int i=0; i<input_num;i++)
        {
            sum += Character.getNumericValue(number.charAt(i));
        }
        System.out.println(sum);
    }
}
