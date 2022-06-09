import java.util.Scanner;

public class Factorial_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        Recursion recursion = new Recursion();
        System.out.println(recursion.factorial(input));
    }
}

class Recursion {
    public int factorial(int i) {

        if (i == 0) return 1;
        int sum = 1;
        if (i > 0) {
            sum *= i;
        }
        return sum * factorial(--i);
    }
}
