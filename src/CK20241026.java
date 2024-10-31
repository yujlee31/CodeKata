public class CK20241026 {
    public static String solution(int num) {
        String answer = "";

        if (num % 2 != 0) {
            answer = "Odd";
        } else {
            answer = "Even";
        }


        return answer; // return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
