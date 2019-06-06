package programmers.level.one;

/**
 * 
 * 문제제목 : 2016년 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12901
 * 작 성 일 : 2019.06.01
 * 작 성 자 : YUN YOUNG
 * 문제설명 : 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a, b를 입력받아
 * 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN, MON, TUE, WED, THU, FRI, SAT 입니다.
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 * 
 * 제한조건
 * 2016년은 윤년입니다.
 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45알 같은 날짜는 주어지지 않습니다)
 */
public class Year2016 {
	public static void main(String[] args) {
		Year2016 year = new Year2016();
		System.out.println(year.solution(1, 1));
		System.out.println(year.solution(5, 24));
	}

	private String solution(int m, int d) {
		int month = m;
		int day = d;
		String answer= "";
		
		// 문제에서 1월 1일이 금요일이라고 주어졌으니 금요일을 기준으로 잡는다
		String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int allDate = 0;
		
		// 해당 월 전까지의 전체 일수를 구한다. 
		for (int i = 0; i < month-1; i++) {
			allDate = allDate + date[i];
		}
		
		// 해당 월의 입력받은 일수만큼 더한다.
		allDate = allDate + day - 1;
	
		// 일주일로 나눈 나머지를 계산한다.
		answer = week[allDate % 7];
		
		return answer;
	}
}
