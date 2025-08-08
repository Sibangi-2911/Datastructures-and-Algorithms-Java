import java.util.*;

public class link1 {
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static  Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data){
    //create new node
    Node newNode = new Node(data);

    size++;

    if(head == null){
      head = tail = newNode;
      return;
    }

    //next= head-link
    newNode.next = head;

    //head = newnode
    head = newNode;
  }
  
  public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
      head=tail=newNode;
      return;
    }
    tail.next = newNode;
    tail=newNode;
  }
  public void add(int index, int data){
    if(index==0){
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i=0;
    while(i<index-1 && temp!=null){
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void print(){
    if(head==null){
      System.out.println("LL is empty.");
      return;
    }
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public static void main(String args[]){
    link1 ll = new link1();
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);
    ll.print();
    ll.add(2, 9);
    ll.print();
    System.out.println(ll.size);
  }
}
