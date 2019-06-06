package programmers.level.one;

/**
 * @문제제목 : 정수제곱근 판별 
 * @문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12934
 * @date : 2019.06.06
 * @author yunyoung
 * 
 * @문제설명 : 임의의 정수 n에 대해, n이 어떤 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 정수 x의 제곱이 아니라면 -1을
 * 리턴하는 함수를 완성하세요.
 * 
 * @제한사항
 * n은 1 이상, 50000000000000 이하인 정수입니다.
 *
 */
public class SquareRoot {
	public static void main(String[] args) {
		SquareRoot squareRoot = new SquareRoot();
		System.out.println(squareRoot.solution(121));
		System.out.println(squareRoot.solution(3));
	}

	private long solution(long n) {
		try {
			final long sqrt = (long) Math.sqrt(n);
			final long pow  = (long) Math.pow(sqrt, 2);	
			return (long) (pow == n ? Math.pow((sqrt + 1), 2) : -1);
			
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
