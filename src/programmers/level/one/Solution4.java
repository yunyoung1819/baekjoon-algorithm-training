package programmers.level.one;

/**
 * 문제제목 : 문자열 내 p와 y의 개수
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12916
 * 작 성 일 : 2019.05.01
 * 작 성 자 : yun young
 * 문제설명 : 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 
 * 같으면 True, 다르면 False를 return하는 solution를 완성하세요. 
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 
 * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 예를들어 s가 "pPoooyY"면 true를 return 하고 "Pyy"라면 false를 return 합니다.
 * 
 * 제한사항 
 * 문자열 s의 길이 : 50이하의 자연수 
 * 문자열 s는 알파벳으로만 이루어져 있습니다. 
 *
 */
class Solution4 {
	boolean solution(String s) {
		String words = s.toLowerCase();
		boolean answer = true;
		
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == 'p') {
                pCount++;
            } else if (words.charAt(i) == 'y') {
                yCount++;
            }
        }
        
        if (pCount == yCount) {
            return true;
        } else if (pCount == 0 && yCount == 0) {
            return true;
        } else if (pCount != yCount) {
            answer = false;
        }
        return answer;
    }
}