class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
           int binaryGap = 0;

            if (N == 0) {
                binaryGap = 0;
            }
            
            while (N % 2 == 0) {
                N /= 2;
            }
            
            for (int j = 0; N > 0; N /= 2) {
                    if (N % 2 == 0) {
                        j++;
                    } else {
                        if (j > binaryGap) {
                            binaryGap = j;
                        }
            
                        j = 0;
                    }
                }
            
            return binaryGap;
    }

}
