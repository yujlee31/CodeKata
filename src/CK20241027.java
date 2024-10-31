public class CK20241027 {
    public double solution(int[] arr) {
        double answer = 0;
        double tempSum = 0;
        int step = 0;

        if (arr.length >= 1 && arr.length <= 100) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i] >= -10000 && arr[i] <= 10000) {
                    tempSum += arr[i];
                    step = i;
                } else {
//                    tempSum = 0; //정상 합이 0이면 논리오류 발생!!!!!!!!
                    break;
                }
            }
            if (step == arr.length - 1) {
                answer = tempSum / arr.length;
            }
        }
            return answer;
//        return Arrays.stream(arr).average().getAsDouble();
    }

}
