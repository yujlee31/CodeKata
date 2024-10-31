public class CK20241025 {
    public double solution(int[] numbers) {
        double answer = 0;
        double tempSum = 0;

        if (numbers.length>=1 && numbers.length<=100) {

            for (int i = 0; i < numbers.length; i++)
            {
                if (numbers[i] <0 || numbers[i] > 1000) {
                    tempSum = -1;
                    break;
                } else {
                    tempSum += numbers[i];
                }
            }

            if (tempSum == -1) {
                return -1;
            } else {
                answer = tempSum / numbers.length;
            }
        }

            return answer;
    }

//import java.util.Arrays;
//
//    class Solution {
//        public double solution(int[] numbers) {
//            return Arrays.stream(numbers).average().orElse(0);
//        }
//    }
}
