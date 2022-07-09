import java.util.Scanner;
import java.util.StringTokenizer;

public class NumofWords_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        StringTokenizer token = new StringTokenizer(input, " ");

        System.out.println(token.countTokens());
    }
}
