package week1;

import java.util.Scanner;

public class hexToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex, 16);

        System.out.println(decimal);
    }
}
