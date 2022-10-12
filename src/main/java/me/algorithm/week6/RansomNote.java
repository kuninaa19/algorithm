package me.algorithm.week6;

import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> letterCollector = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char magazineLetter = magazine.charAt(i);
            int v = 1;

            if (letterCollector.containsKey(magazineLetter)) {
                v = letterCollector.get(magazineLetter) + 1;
            }

            letterCollector.put(magazineLetter, v);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ransomNoteLetter = ransomNote.charAt(i);

            if (!letterCollector.containsKey(ransomNoteLetter)) {
                return false;
            }
            if (letterCollector.get(ransomNoteLetter) == 0) {
                return false;
            }
            letterCollector.merge(ransomNoteLetter, -1, Integer::sum);
        }

        return true;
    }

    /* 1. 알파벳 범위(27)까지 배열 생성
    *  2. ransomeNote의 문자를 통해 아스키코드 값에서 a를 빼면 알파벳 순서 인덱스가 나옴 a -> 0
    *  3. 해당 인덱스 배열 값에 +1씩 추가
    *  4. magazine 문자열 크기동안 for문 진행
    *  5. magazine 문자 값이 0보다 크면 배열 값을 -1 진행, sum +1 (sum은 ransomNote 길이와 비교용)
    *  6. ransomeNote 문자열 전체길이와 sum의 값이 같다면 True
    * */
    public static boolean anotherSolution(String ransomNote, String magazine){
        int[] a = new int[26];
        int len = ransomNote.length();
        int sum = 0;
        for(int i = 0; i < len; i++) {
            a[ransomNote.charAt(i) - 'a']++;
        }
        for(int i = 0; i < magazine.length(); i++) {
            if (a[magazine.charAt(i) - 'a'] > 0) {
                a[magazine.charAt(i) - 'a']--;
                sum++;
            }
            if (len == sum) return true;
        }
        return false;
    }
}