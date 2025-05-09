package chapter02;

public class MyNode {
	public int mNum;
	public MyNode mNode;
	
	public MyNode(int num){
		mNum = num;
		mNode = null;
	}
	
	public void Append(MyNode node) {
		if(mNode == null){
			mNode = node;
		}
		else {
			mNode.Append(node);
		}
	}
	
	public int Search(int num) {
		if(mNum == num)
			return mNum;
		else if(mNode == null)
			return -1;
		else
			return mNode.Search(num);
	}
}
