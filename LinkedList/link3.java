//search for a key in the linked list & return the position where it is found & if not found return -1->O(n)
public class link3 {
  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
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
    tail.next = newNode;
    tail = newNode;
  }
  public int iterativeSearch(int key){
    int index = 0;
    Node temp =  head;
    while(temp!=null){
      if(temp.data==key){
        return index;
      }
      temp = temp.next;
      index++;
    }
    return -1;
  }
  public void print(){
    Node temp =head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public static void main(String args[]){
    link3 ll = new link3();
    ll.addFirst(7);
    ll.addFirst(6);
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addLast(3);
    ll.addLast(2);
    ll.print();
    System.out.println(ll.iterativeSearch(6));
    System.out.println(ll.iterativeSearch(10));


  }
}
