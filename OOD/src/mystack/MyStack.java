package mystack;

import java.util.Vector;

public class MyStack<T>{
	private Vector<T> vT;
	private int top;
	
	public MyStack(){
		vT = new Vector<T>();
		top = -1;
	}
	
	public void push(T element) {
		++top;
		vT.add(element);
	}
	
	public T pop() {
		return vT.remove(top--);
	}
	
	public boolean isEmpty() {
		return vT.isEmpty();
	}
	
	public int size() {
		return vT.size();
	}
}
