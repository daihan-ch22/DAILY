import java.util.*;

public class HidePhoneNum {
    public static void main(String[] args) {
        System.out.println(HidePhoneNumber("027778888"));
    }

    public static String HidePhoneNumber(String phone_number){
        String ans = "";
        int len = phone_number.length();

        for(int i = 0; i<len; i++)
        {
            if(i < len-4) {
                ans += "*";
            }else{
                ans +=phone_number.charAt(i);
            }
        }
        return ans;
    }
}
