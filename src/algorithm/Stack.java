package algorithm;

/**
 * JAVA를 이용한 Stack 구현
 *
 */
public class Stack {

	int top;	 // 스택의 top
	int[] stack; // 스택
	int size;    // 스택 사이즈
	
	public Stack(int size) {	// 생성자를 이용한 Stack 초기화
		top = -1;
		stack = new int[size];
		this.size = size;
	}
	
	/* peek */
	public void peek() {
		System.out.println("PEEK : " + stack[top]);
	}
	
	/* push */
	public void push(int value) {
		stack[++top] = value;
		System.out.println(stack[top] + "PUSH !");
	}
	
	/* pop */
	public int pop() {
		System.out.println(stack[top] + "POP !");
		return stack[top--];
	}
	
	/* stack print */
	public void printStack() {
		System.out.println("-- STACK LIST --");
		for(int i = top; i >= 0; i--)
			System.out.println(stack[i]);
		System.out.println("-- END OF LIST --");
	}
	
}
