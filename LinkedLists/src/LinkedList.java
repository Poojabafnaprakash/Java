
public class LinkedList {
	Node head;
	

	public Node getHead(){
		return head;
	}
	
	
	public void insertAtBegining(int data){
		
		Node node = new Node(data);
		node.setNext(head);
		head = node;
	}
	
	public void insertAtEnd(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
		}
		else 
		{
			Node curr = head;
			while(curr.getNext()!=null){
				curr = curr.getNext();
				 
			}
			curr.setNext(node);
		}
	}
		
	
	public void display(){
		while(head!=null){
			System.out.print(head + " ");
			head = head.getNext();
		}
	}

}
