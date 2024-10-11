package programmers.challenge;

/**
 * 문제제목 : 시저 암호
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12926
 * 작 성 일 : 2019.05.04
 * 작 성 자 : yun young
 * 
 * 문제설명 : 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을
 * 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
 * "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수,
 * solution을 완성해보세요.
 * 
 * 제한조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25 이하인 자연수 입니다.
 *
 */
public class Caesar {
	
	// 실행을 위한 테스트 코드 
	public static void main(String[] args) {
		Caesar c = new Caesar();
		String s = "X x Y y Z z";
		int n = 2;
		c.caesar(s, n);
	}
	
	public String caesar(String s, int n) {
		String answer = "";
		char[] alphabet = new char[s.length()];
		alphabet = s.toCharArray();
		
		for (int i = 0; i < alphabet.length; i++) {
			// 대문자 A ~ Z : 65 ~ 90, 소문자 a ~ z : 97 ~ 122 공백 : 32
			if (alphabet[i] >= 65 && alphabet[i] <= 90) {
				alphabet[i] += n;
				if (alphabet[i] > 90) {
					alphabet[i] -= 26;
				}
			} else if (alphabet[i] >= 97 && alphabet[i] <= 122) {
				alphabet[i] += n;
				if (alphabet[i] > 122) {
					alphabet[i] -= 26;
				}
			} else if (alphabet[i] == 32) {
				alphabet[i] = 32;
			}
		}
		answer = new String(alphabet);
		System.out.print(answer);
		return answer;
	}
}
