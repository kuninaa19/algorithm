package me.algorithm.week7;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    /* 슬라이딩 윈도우 + 투포인터 + 해시맵
    * 해시맵을 사용안할땐 아스키코드만큼의 배열을 선언한 후 알파벳 배열안에 인덱스 값을 넣어주면 됨
    * */
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            Integer index = hashMap.get(charAt);

            if (index != null) {
                start = Math.max(index + 1, start);
            }

            end++;
            max = Math.max(max, end - start);

            hashMap.put(charAt, i);
        }

        return max;
    }
}
