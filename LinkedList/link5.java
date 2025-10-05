//Code to Reverse a linkedlist- iterative approach - O(n)
public class link5 {
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;
  public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
      head=tail=newNode;
      return;
    }
    newNode.next=head;
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
    tail = newNode;
  }
  public void print(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public void reverseLL(){
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while(curr!=null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }
  public static void main(String args[]){
    link5 ll = new link5();
    ll.addFirst(7);
    ll.addFirst(6);
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addLast(3);
    ll.addLast(2);
    ll.print();
    ll.reverseLL();
    ll.print();
  }
}
