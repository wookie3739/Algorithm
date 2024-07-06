import java.util.*;

class Solution {
    public String solution(String new_id) {
        // 1번째 step: 모든 문자를 소문자로 변환
        String step1 = new_id.toLowerCase();

        // 2번째 step: 특정 문자들을 제외한 모든 문자 제거
        StringBuilder step2Builder = new StringBuilder();
        for (char ch : step1.toCharArray()) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') ||
                ch == '-' || ch == '_' || ch == '.') {
                step2Builder.append(ch);
            }
        }
        
        // 3번째 step: 연속된 점을 하나의 점으로 치환
        String step3 = step2Builder.toString();
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }

        // 4번째 step: 처음과 끝에 위치한 점 제거
        String step4 = step3;
        if (step4.length() > 0 && step4.charAt(0) == '.') {
            step4 = step4.substring(1);
        }
        if (step4.length() > 0 && step4.charAt(step4.length() - 1) == '.') {
            step4 = step4.substring(0, step4.length() - 1);
        }

        // 5번째 step: 빈 문자열을 'a'로 치환
        if (step4.isEmpty()) {
            step4 = "a";
        }

        // 6번째 step: 길이가 16자 이상이면 15자로 만들기
        if (step4.length() >= 16) {
            step4 = step4.substring(0, 15);
            if (step4.charAt(step4.length() - 1) == '.') {
                step4 = step4.substring(0, step4.length() - 1);
            }
        }

        // 7번째 step: 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 반복
        while (step4.length() <= 2) {
            step4 += step4.charAt(step4.length() - 1);
        }

        return step4;
    }
}
