public class CK20241024 {
    public static int solution(int n) {
        int answer = 0;

        if (n>0 && n<=1000) {
            for (int i = 0; i <=(n/2); i++) {
                answer += 2 * i;
                System.out.println(answer);
            }
        }

        return answer;
    }

    //모범답안
//    public int solution(int n) {
//        int answer = 0;
//
//        for(int i=2; i<=n; i+=2){
//            answer+=i;
//        }
//
//        return answer;
//    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
