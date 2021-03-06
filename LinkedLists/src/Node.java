
public class Node {
	public int data;
	public Node next;
	
	Node(){
		data = Integer.MIN_VALUE;
		next = null;
	}
	
	Node(int data){
		this.data = data;
		next = null;
	}
	
	public int getData(){
		return data;
	}

	public void setData(int data){
		this.data =  data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node node){
		next = node;
	}
	
	public String toString(){
		return Integer.toString(data);
	}
	
}
