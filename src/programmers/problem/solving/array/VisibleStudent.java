package programmers.problem.solving.array;

import java.util.*;

public class VisibleStudent {	
	private int solution(int[] height) {
		int count = 0;
		int taller = 0;
		for (int i = 0; i < height.length; i++) {	
			if (i == 0) {
				taller = height[0];
				count++;
			} 
			if (taller < height[i]) {
				taller = height[i];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n];
		
		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}
		VisibleStudent visibleStudent = new VisibleStudent();
		int answer = visibleStudent.solution(height);
		
		System.out.print(answer);
		sc.close();
	}
}
