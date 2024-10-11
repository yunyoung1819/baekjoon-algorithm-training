package programmers.challenge.level1;

/**
 * 문제: 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 
 * 제한사항 : s는 길이가 1이상, 100이하인 스트링입니다. 
 */
class Solution1 {
	public String solution(String s) {
		String answer = "";
	    int wordLength = s.length();
	    int middleNum = wordLength/2;
	      
	    if (wordLength%2 != 0) {
	    	answer = s.substring(middleNum, middleNum+1);
	    } else {
	    	answer = s.substring(middleNum-1, middleNum+1);
	    }
	    
	    return answer;
	}
}
