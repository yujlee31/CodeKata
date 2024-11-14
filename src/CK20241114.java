public class CK20241114 {

    //문자열 내 p와 y의 개수
    boolean solution1(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        char[] charArray = s.toUpperCase().toCharArray();

        for (char c : charArray) {
            if (c == 'P') pCount++;
            if (c == 'Y') yCount++;
        }

        if ((pCount == yCount) || (pCount==0 && yCount==0)) {
            return true;
        } else {
            return false;
        }
    }

    //가운데 글자 가져오기
    public String solution2(String s) {
        String answer = "";
        int length  = s.length();
        int idx = length/2;

        if (length % 2 != 0) {
            answer += s.charAt(idx);
        } else {

            answer += s.charAt(idx-1);
            answer += s.charAt(idx);
        }

        System.out.println(answer);

        return answer;
    }
    }
