class Solution {
    public int[] solution(long n) {
        String[] array = String.valueOf(n).split("");

        int[] newArray1 = new int [array.length];
        for(int i = 0; i < array.length; i++){
            newArray1[i] = Integer.parseInt(array[i]);
        }

        int[] newArray2 = new int [newArray1.length];
        for(int i = 0; i < newArray1.length; i++){
            newArray2[newArray1.length - 1 - i] = newArray1[i];
        }

        return newArray2;
    }
}