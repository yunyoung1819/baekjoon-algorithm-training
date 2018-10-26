package algorithm.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 탐욕 알고리즘(greedy algorithm)
 * 
 * 탐욕 알고리즘은 동적 계획법처럼 대상 문제가 최적 부분 구조를 갖고 있어야 한다.
 * 탐욕 알고리즘은 다음과 같이 동작한다.
 * 
 * 1) 해 선택 : 현재 상태에서 부분 문제의 최적해를 구한 뒤, 이를 부분해 집합에 추가한다.
 * 2) 실행가능성 검사 : 새로운 부분해 집합이 실행 가능한지 확인한다. (문제의 제약 조건을 위반하는지 검사한다)
 * 3) 해 검사 : 새로운 부분해 집합이 문제의 해가 되는지를 확인한다. 잔체 문제의 해가 완성되지 않았다면 1)부터 다시 시작한다.
 * 
 * 거스름돈 줄이기에 탐욕 알고리즘을 적용할 수 있다.
 * 1) 해 선택 : 현재 고를 수 있는 가장 단위가 큰 동전을 하나 고른다.
 * 2) 실행 가능성 검사 : 1)에서 고른 동전 단위를 잔돈에서 뺀다. 뺀 값이 0보다 작으면 고를 수 있는 동전에서
 * 이 동전을 빼고 1)부터 다시 시작한다. 0보다 크면 2)를 계속한다.
 * 3) 해 검사 : 차감된 거스름돈이 0이 되는지 검사한다. 0보다 크면 1)로 돌아가서 거스름돈에 추가할 동전을 고른다.
 *
 */

public class CoinGreedy { 
	private int mNumOfCoins; 
	private PriorityQueue<Integer> mPQ; 
	
	public CoinGreedy(int numOfCoin) { 
		mNumOfCoins = numOfCoin; //우선순위큐가 높은 동전 먼져 출력하도록 한다.
		mPQ = new PriorityQueue<Integer>(mNumOfCoins,new Comparator<Integer>(){ 
			@Override 
			public int compare(Integer o1, Integer o2) {  
				return o2.intValue()-o1.intValue(); 
			} 
		}); 
	} 
	
	public void addCoin(int coinValue){ 
		mPQ.add(new Integer(coinValue)); 
	} 
	
	public void calculate(int value){ 
		int coin=0; 
		int change=value; //첫번째 동전을 선택한다. 
		
		if(!mPQ.isEmpty()) coin = mPQ.remove(); 
		else return; //실패한 경우 
		
		while(true) { //선택한 동전 단위를 잔돈에서 뺀다. 이 값이 0보다 크면 반복한다. 
			if(change-coin>=0) { 
				System.out.println(coin); 
				change=change-coin; 
			} else { 
				//선택한 동전 단위를 잔돈에서 뺀다. 이 값이 0보다 작으면 다음 동전을 고르고 반복한다. 
				if(!mPQ.isEmpty()) coin=mPQ.remove(); 
				else return; //실패한 경우 
			} if(change==0) return; //성공한 경우 
		} 
	 } 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 int numOfCoin=sc.nextInt(); 
		 CoinGreedy cg=new CoinGreedy(numOfCoin); 
		 
		 for(int i=0; i < numOfCoin; i++){ 
			 cg.addCoin(sc.nextInt()); 
		 } 
		 
		 cg.calculate(sc.nextInt()); 
		
	 } 
}


