package edu.monmouth.HW2;

import edu.monmouth.bookExercise.Book;

public class ListNode {

  private Node head; 

  public ListNode() {
    head = null;
  }
  
  public Node removeFirst() {
	  /* placeholder */
	 Node temp = head;
	 if(head!=null) {
		 head = head.getNext();
	 }
	 
	 	
	return temp;
  }
  
  
  public Node first() {
	    /* placeholder */
	  
	return head;
  }
  
  public Node last() {
	   /* placeholder */
	  Node cur=head;
	  if(cur != null) {
		while(cur.getNext() !=null) {
			    cur=cur.getNext();
		 }
	  }
	return cur;
  }

  public void insert(Book element) {
    Node newNode = new Node(element);
    newNode.setNext(head);
    head = newNode;
  }

  public void insertEnd(Book element) {
	/* placeholder */
	  if(head == null) {
	  head = new Node(element);
	  }else {
		  Node cur=head;
			while(cur.getNext() !=null) {
				
				    cur=cur.getNext();	    
				  
	  }
			cur.setNext(new Node(element));
}
	  }

 public boolean isEmpty() { 
	/* placeholder */
	 if(head == null) {
	return true;    
	 }
	 return false;
  }
  
  public int size() {
    /* placeholder */
	  int i = 0;
	  Node cur=head;
		while(cur !=null) {
				i++;
			    cur=cur.getNext();
			  }
    return i;
  }
    
  public void clear() {
    head = null;
  }

@Override
  public String toString() {
	StringBuilder logString = new StringBuilder();
    Node node;
    node = head;
    int count = 0;
    
    while (node != null) {
      count++;
      logString.append(count + " . " + node.getInfo() + "\n");
      node = node.getNext();
    }
    return logString.toString();
  }
}
