package algorithm;

public class YoungStack {
	
	public static void main(String[] args) {
		Stack st = new Stack(100);
		
		st.push(5);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(1);
		
		st.printStack();
		
		st.pop();
		
		st.pop();
		
		st.push(15);
		
		st.printStack();
		
		st.peek();
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
		st.push(30);
		
		st.peek();
	}

}
