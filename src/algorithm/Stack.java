package algorithm;

/**
 * JAVA 를 이용한 스택 구현
 * 
 * 스택 클래스에는 기본적으로 Peek, Pop, Push 등의 메소드가 구현되어야 
 * 기초 동작을 수행할 수 있다.
 */
public class Stack {

	int top;
	int[] stack;
	int size;
	
	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}
	
	public void peek() {
		System.out.println("PEEK : " + stack[top]);
	}
	
	public void push(int value) {
		stack[++top] = value;
		System.out.println(stack[top] + "PUSH !");
	}
	
	public int pop() {
		System.out.println(stack[top] + "POP !");
		return stack[top--];
	}
	
	public void printStack() {
		System.out.println("-- STACK LIST --");

		for(int i = top; i>= 0; i--) {
			System.out.println(stack[i]);
		}
		
		System.out.println("-- END OF LIST --");
	}
	
}
