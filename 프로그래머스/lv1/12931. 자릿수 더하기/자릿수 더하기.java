import java.util.*;

public class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        char[] digits1 = num.toCharArray();
        int sum = 0;

        for(int i = 0; i < digits1.length; i++ ){
            sum += Character.getNumericValue(digits1[i]);
        }
        return sum;
    }
}