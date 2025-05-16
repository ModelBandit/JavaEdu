package List;

public class Node {
	public int value;
	public Node next;
	
	public Node(){
		this(0, null);
	}
	public Node(int value){
		this(value, null);
	}
	
	public Node(int value, Node nextNode){
		this.value = value;
		next = nextNode;
	}
}
