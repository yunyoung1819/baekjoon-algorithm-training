package programmers.challenge.level1;

/**
 * 문제제목 : 행렬의 덧셈
 * 문제링크 : https://programmers.co.kr/learn/courses/30/lessons/12950
 * 작 성 일 : 2019.05.12
 * 작 성 자 : yun young
 * 문제설명 : 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
 * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 * 제한조건 : 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
 * 입출력의 예
 * arr1: [[1,2],[2,3]] arr2: [[3,4],[5,6]] return : [[4,6],[7,9]]
 * arr1: [[1],[2]] arr2: [[3],[4]] return: [[4],[6]]
 *
 */
public class MatrixAddition {
	// 아래는 테스트를 출력해보기 위한 코드입니다. 
	public static void main(String[] args) {
		MatrixAddition matrixAddition = new MatrixAddition();
		int[][] arr1 = { {1, 2}, {2, 3} };
		int[][] arr2 = { {3, 4}, {5, 6} };
		int[][] answer = matrixAddition.solution(arr1, arr2);
		if (answer[0][0] == 4 && answer[0][1] == 6 && answer[1][0] == 7 && answer[1][1] == 9) { 
			System.out.println("test success"); 
		} else {
			System.out.println("test fail"); 
		}	 
	}
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
}