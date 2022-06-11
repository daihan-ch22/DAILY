public class Collatz_conjecture {
    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.solution(626331));
    }
}

class Solution {
    public int solution(int num) {
        long answer = num;
        if (answer == 1) return 0;

        int count = 0;

        while (answer >= 1) {
            //even
            if (answer % 2 == 0) {
                answer = answer / 2;

            }
            //odd
            else if (answer % 2 == 1)
                answer = (answer * 3 + 1);

            ++count;

            if (answer == 1) break;

            if (count == 500) return -1;
        }
        return count;
    }
}


