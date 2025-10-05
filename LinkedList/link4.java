//Code for Recursive search for a key in the linked list & return the position where it is found & if not found return -1 ->O(n)
public class link4 {
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
      head = tail=newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public static int helper(Node head, int key){
    if(head==null){
      return -1;
    }
    if(head.data==key){
      return 0;
    }
    int index = helper(head.next, key);
    if(index==-1){
      return -1;
    }
    return index+1;
  }

public static int recursiveSearch(int key){
  return helper(head, key);
}
  public void print(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public static void main(String args[]){
    link4 ll = new link4();
    ll.addFirst(4);
    ll.addFirst(5);
    ll.addFirst(6);
    ll.addFirst(8);
    ll.addLast(9);
    ll.addLast(1);
    ll.print();
    System.out.println(recursiveSearch(10));
    System.out.println(recursiveSearch(1));
  }
}
