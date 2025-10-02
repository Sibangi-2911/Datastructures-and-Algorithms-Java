//code to remove first and last node from linked list
public class link2{
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next = null;
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
    newNode.next = head;
    head = newNode;
  }
  public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
      head=tail=newNode;
      return;
    }
    tail.next=newNode;
    tail=newNode;
  }
  public int removeFirst(){
    if(size==0){
      System.out.println("LL is empty.");
      return Integer.MIN_VALUE;
    } else if(size==1){
      int val = head.data;
      head=tail=null;
      size=0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }
  public int removeLast(){
    if(size==0){
      System.out.println("LL is empty.");
      return Integer.MIN_VALUE;
    } else if(size==1){
      int val = head.data;
      head=tail=null;
      return val;
    }
    Node prev = head;
    for(int i=0;i<size-2;i++){
      prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }
  public void print(){
    if(head==null){
      System.out.println("LL is empty!!!");
      return;
    }
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println("null");
  }
  public static void main(String args[]){
    link2 ll = new link2();
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(4);
    ll.print();
    ll.addFirst(6);
    ll.print();
    ll.addFirst(8);
    ll.print();
    ll.addLast(15);
    ll.print();
    ll.addLast(19);
    ll.print();
    ll.removeFirst();
    ll.print();
    ll.removeLast();
    ll.print();
    System.out.println(ll.size);

  }
}
