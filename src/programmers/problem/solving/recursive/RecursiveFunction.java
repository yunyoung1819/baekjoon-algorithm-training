package programmers.problem.solving.recursive;

/**
 * 재귀함수
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
 * <p>
 * 입력설명
 * 첫 번째 줄은 정수 N(3<=N<=10)이 입력된다.
 * <p>
 * 출력설명
 * 첫째 줄에 출력한다.
 * <p>
 * 입력 예제1: 3
 * 출력 예제1: 1 2 3
 */
public class RecursiveFunction {

	private void DFS(int n) {
		if (n == 0) return;
		else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		RecursiveFunction T = new RecursiveFunction();
		T.DFS(3);
	}
}
