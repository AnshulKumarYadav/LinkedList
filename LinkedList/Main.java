package LinkedList;

public class Main {
	public static void main(String[] args) {
		Linked_List list = new Linked_List();
//		System.out.println("I am there");
		list.addAtHead(8);
		list.addAtHead(9);
		list.addAtHead(12);
		list.addAtHead(92);
		list.addAtTail(65);
		list.addAtTail(45);
		list.addAtHead(34);
		list.printList();       //output:- 34-->92-->12-->9-->8-->65-->45-->null
		
		list.deleteAtHead();
		list.printList();     //output:- 92-->12-->9-->8-->65-->45-->null
		
		list.deleteAtTail();  //output:- 92-->12-->9-->8-->65-->null
		list.printList();
		
		System.out.println(list.getSize());
		
		list.addAnyWhere(0);
		list.printList();
		
	}
}
