package programmers.challenge.level1;

/**
 * 문제제목 : 서울에서 김서방 찾기 
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12919
 * 작 성 일 : 2019.05.06
 * 작 성 자 : yun young
 * 
 * 문제설명 : String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을
 * 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 
 * 입력되는 경우는 없습니다.
 * 
 * 제한사항
 * seoul은 길이 1 이상, 1000 이하인 배열입니다.
 * seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
 * "Kim"은 반드시 seoul안에 포함되어 있습니다.
 * 
 * 입출력예
 * seoul : {"Jane", "Kim"]
 * return : "김서방은 1에 있다"
 *
 */
public class KimSeoBang {
	//test code
	public static void main(String[] args) {
		KimSeoBang kimseobang = new KimSeoBang();
		String[] seoul = {"Jane", "Kim"};
		kimseobang.solution(seoul);
	}
	
	public String solution(String[] seoul) {
		int location = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				location = i;
			}
		}
		return "김서방은 " + location + "에 있다";
	}
}
