//Code to find and remove nth node from end
public class link6 {
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
  public void deleteNthfromEnd(int n){
    //calculate size
    int sz=0;
    Node temp = head;
    while(temp!=null){
      temp = temp.next;
      sz++;
    }
    if(n==sz){
      head = head.next;
      return;
    }
    int i =1;
    int findToIndex = sz-n;
    Node prev = head;
    while(i<findToIndex){
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return;
  }
  public static void main(String args[]){
    link6 ll = new link6();
    ll.addFirst(7);
    ll.addFirst(6);
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addLast(3);
    ll.addLast(2);
    ll.print();
    ll.deleteNthfromEnd(3);
    ll.print();
  }
}

