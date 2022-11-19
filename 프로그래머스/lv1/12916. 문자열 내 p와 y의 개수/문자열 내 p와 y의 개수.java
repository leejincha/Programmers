class Solution {
    boolean solution(String s) {
        String upperS = s.toUpperCase();
        int count1 = 0;
        int count2 = 0;

        if (upperS.contains("P") || upperS.contains("Y")) {
            for (int i = 0; i < upperS.length(); i++) {
                if (upperS.charAt(i) == 'P') {
                    count1++;
                }
            }
            for (int i = 0; i < upperS.length(); i++) {
                if (upperS.charAt(i) == 'Y') {
                    count2++;
                }
            }

            if (count1 == count2) {
                return (true);
            } else {
                return (false);
            }

        } else {
                return (true);
        }
    }
}