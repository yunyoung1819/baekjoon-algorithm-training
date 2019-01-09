package algorithm;



/**
 * 선택 정렬 (Selection Sort)
 * 
 * 주어진 데이터 중 최소값을 찾음
 * 최소값을 맨 앞에 위치한 값과 교환
 * 정렬된 데이터를 제외한 나머지 데이터를 같은 방법으로 정렬
 * 
 * 시간 복잡도 : O(n^2)
 * 
 * 선택 정렬의 장점
 * 데이터의 양이 적을 때 좋은 성능을 나타냄
 * 작은 값을 선택하기 위해서 비교는 여러번 수행되지만 교환횟수가 적다.
 * 
 * 선택 정렬의 단점
 * 100 개 이상의 자료에 대해서는 속도가 급격히 떨어져 적절히 사용되기 힘들다.
 */
public class Selection {
	public static void main(String[] args) {
		
		Selection selection = new Selection();
		
		int data[] = {66, 10, 1, 99, 5};
		
		selection.sort(data);
		
		for(int i = 0; i < data.length; i++) {
			System.out.println("data["+i+"]: " + data[i]);
		}
	}

	private void sort(int[] data) {
		int size = data.length;	// 정렬될 데이터의 크기 (사이즈)
		int min;  // 최소값을 가진 데이터의 인덱스 저장 변수
		int temp; // 임시변수
		
		for(int i = 0; i < size-1; i++) { // size-1 : 마지막 요소는 자연스럽게 정렬
			min = i;
			for(int j = i+1; j < size; j++) {
				if(data[min] > data[j]) {
					min = j;
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
	}
}
