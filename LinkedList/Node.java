package LinkedList;

//<<-------------------------------Node for linklists--------------------------------->>
public class Node {
	int data;        //Integer type of data in a node we can take any other type of data like String,char,etc
	Node next;       //address of next node
	Linked_List linked_List = new Linked_List(); 
	public Node() {}     //zero argument constructor
	public Node(int data)  //parameterized constructor
	{
		this.data = data;
		this.next = null;
		linked_List.size++;
		
	}
}
