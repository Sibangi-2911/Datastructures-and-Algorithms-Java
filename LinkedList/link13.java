//Doubly linked list
public class link13 {
  public class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;

  //add
  public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }
  //print
  public void print(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+"<->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  //remove last
  public static void main(String args[]){
    link13 dll = new link13();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.print();
    System.out.println(dll.size);

  }
}
