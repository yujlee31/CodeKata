import java.time.LocalDate;

public class CK20241019 {
    public static int solution(int age) {
        int answer = 0;
        int yearNow = LocalDate.now().getYear();

        answer = yearNow - age - 1; //2022년 기준이라 -1이 맞음 허허
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(40));
    }
}
