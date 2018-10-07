/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;


/**
 *
 * @author yeman
 */
public class LinkedList {
 
Node head;

  static class Node{
   int data;
   Node next;
   Node(int d)   { 
       data = d;  next=null;
   } 
    }
  public void printList() 
    { 
        Node n = head; 
        System.out.print("The values in the linked list are: " );
        while (n != null) 
        { 
             System.out.print(n.data+" "); 
            n = n.next; 
        }
    }

// function returning a node
public int kthToLast (Node node, int k){
  Node current = head; // pointer 
  Node follower = head; // pointer to follow the main pointer 
  
  for (int i=0; i < k; i++){
    if (current == null){ // check if it reaches the end 
      	System.out.println("\nOut of Range");
      	return 0;
    }
    // if not null, continue... 1 2 3 4 5
    current = current.next;
    
  }
  // move the pointers by checking that we haven't reached null 
  while(current.next != null){
    current = current.next;
    follower = follower.next;
  }

  
  return follower.data;
}

;


 public static void main(String[] args) {
        // TODO code application logic here
       LinkedList LL = new LinkedList();
      
       LL.head = new Node(1);
      Node second = new Node(2);
      Node third = new Node(3);
      Node fourth = new Node(4);
      Node fifth = new Node(5);
      
      LL.head.next = second; 
       second.next = third;
       third.next = fourth;
       fourth.next = fifth;
       LL.printList(); 
       System.out.println("\nThe kth value to the last element is: " + LL.kthToLast(LL.head, 2));
       
       
    }
    
}
