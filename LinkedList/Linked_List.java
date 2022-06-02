package LinkedList;

public class Linked_List {
	Node head;
	int size;
	public Linked_List() {
		this.size = 0;
	}
	
//	<<----------Insert/add node at the head of linkedlist----------->>
	public void addAtHead(int data)
	{
		Node new_Node = new Node(data);
		if(head == null)                           //if there is no head in linkedlist then we create a node 
		{
			head = new_Node;
			return;
		}
		
		new_Node.next = head;                    //if there is a head in a linkedlist then we assign next to head and head to new head
		head = new_Node;
		
	}
	
//	<<---------Insert/add node at the tail of linkedlist------------->>
	public void addAtTail(int data)
	{
		Node new_Node = new Node(data);
		if(head == null)                           //if there is no head in linkedlist then we create a node 
		{
			head = new_Node;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next!=null)        // checking the next of nodes if node is null then currentNode.next = new_Node;
		{
			currentNode = currentNode.next;
		}
		
		currentNode.next = new_Node;
	}
	
//	<<---------Insert/add node anywhere in the linkedlist------------>>
	public void addAnyWhere()
	{
		
	}
	
//	<<------------------Delete from head in the linkedlist------------>>
	public void deleteAtHead()
	{
		if(head==null)
		{
			System.out.println("The list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
//	<<------------------Delete from tail in the linkedlist------------->>
	public void deleteAtTail()
	{
		if(head==null)
		{
			System.out.println("The list is empty");
			return;
		}
		size--;
		if(head.next==null)
		{
			head = null;
			return;
		}
		
		Node secondLastNode = head;
		Node lastNode = head.next;
		
		while(lastNode.next!=null)
		{
			lastNode = lastNode.next;
			secondLastNode = secondLastNode.next;
		}
		secondLastNode.next = null;
	}
	
//	<<-----------------------Size----------------------------->>
	public int getSize()
	{
		return size;
	}
	
//	<<---------------------Print the list--------------------->>
	public void printList()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		String bag="";
		Node currentNode = head;
		while(currentNode!=null)
		{
			 bag+=(currentNode.data+"-->");
			currentNode = currentNode.next;
		}
		System.out.println(bag+"null");
	}
	
}
