import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CK20241118 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            char[] charArr = s.toCharArray();
            String[] str = s.split("");

//         // map('g', 103) 형식으로 담기
//         Map<String, Integer> map = new HashMap<String, Integer>();
//         for (int i = 0; i < charArr.length; i++) {
//             map.put(Character.toString(charArr[i]), (int)charArr[i]);
//         }

//         // 정렬 -> 출력
//         List<String> keySet = new ArrayList<>(map.keySet());

//         //오름차순
// //         keySet.sort(new Comparator<String>() {
// //             @Override
// //             public int compare(String o1, String o2) {
// //                 return map.get(o1).compareTo(map.get(o2));
// //             }
// //         });

//         //내림차순
//         keySet.sort((o1,o2) -> map.get(o2).compareTo(map.get(o1)));

//          for (String key : keySet) {
//             answer += key;
//              System.out.println(key);
//              System.out.println(map.get(key));
//         }

//            // 오름차순
//            // Arrays.sort(charArr);
//            // answer = new String(charArr);
//
//            Arrays.sort(str, Collections.reverseOrder());
//
//            for(String a : str) {
//                answer += a;
//            }


            char[] sol = s.toCharArray();
            Arrays.sort(sol);
            answer = new StringBuilder(new String(sol)).reverse().toString();

            //stream이용
//            public String reverseStr(String str){
//                return Stream.of(str.split(""))
//                        .sorted(Comparator.reverseOrder())
//                        .collect(Collectors.joining());
//            }

            return answer;
        }
    }
}
