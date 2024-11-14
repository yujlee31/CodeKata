public class CK20241114 {

        //문자열 내 p와 y의 개수
        boolean solution(String s) {
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
        
    }
