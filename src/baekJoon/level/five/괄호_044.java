package baekJoon.level.five;

import java.util.Scanner;

/**
 * 문제번호 : 9012번
 * 문제제목 : 괄호
 * 작 성 자 : Yun Young
 * 문제내용 : 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 '(' 와 ')' 만으로 구성되어 있는 문자열이다.
 * 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 
 * 한 쌍의 괄호 기호로 된 "()" 문자열은 기본 VPS 이라고 부른다. 
 * 만일 x가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 "(x)" 도 VPS가 된다.
 * 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS가 된다. 
 * 예를 들어 "(())()"와 "((()))" 는 VPS 이지만 "(()(", "(())()))", 그리고 "(()"는 모두 VPS가 아닌 문자열이다.
 * 여러분은 입력으로 주어진 괄호 문자열이 VPS인지 아닌지를 판단해서 그 결과를 YES와 NO로 나타내어야 한다.
 * 
 * 입    력 : 입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 
 * 입력의 첫번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다.
 * 하나의 괄호 문자열의 길이는 2 이상 50 이하이다.
 * 
 * 출    력 : 출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 "YES", 아니면 "NO"를 
 * 한 줄에 하나씩 차례대로 출력해야 한다. 
 * 
 * 		예제 입력 		         예제 출력
 * 6
 * (())())					NO
 * (((()())()				NO
 * (()())((()))				YES
 * ((()()(()))(((())))()	NO
 * ()()()()(()()())()		YES
 * (()((())()(				NO
 */
public class 괄호_044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {
			System.out.println(isVPS(sc.nextLine()));
		}
		sc.close();
	}

	public static String isVPS(String s) {
		s = s.trim();
		int n = s.length();
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			if(s.charAt(i) == '(') {
				cnt += 1;	// '(' : 여는 괄호이면 cnt에 +1
			}else{
				cnt -= 1;	// ')' : 닫는 괄호이면 cnt에 -1 
			}
			
			if(cnt < 0){	// cnt가 음수이면, 즉 괄호의 개수가 맞지 않으면
				return "NO";
			}
		}
		if(cnt == 0) {
			return "YES";	// cnt의 값이 0인 경우, 즉 괄호의 개수가 맞으면 YES를 리턴
		}else{
			return "NO";	// cnt의 값이 0이 아닌 경우, 즉 괄호의 개수가 맞지 않으면 NO를 리턴
		}
	}
}
