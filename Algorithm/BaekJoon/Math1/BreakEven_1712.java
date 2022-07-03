import java.util.Scanner;

public class BreakEven_1712 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        long fixed_cost = sc.nextLong();
        long variable_cost = sc.nextLong();
        long laptop_price= sc.nextLong();

        System.out.println(BreakEven(fixed_cost, variable_cost, laptop_price));
    }

    public static long BreakEven(long fixed_cost, long variable_cost,
                                 long laptop_price)
    {
        if(laptop_price <= variable_cost) return -1;

        else return (fixed_cost/(laptop_price-variable_cost))+1;
    }
}
