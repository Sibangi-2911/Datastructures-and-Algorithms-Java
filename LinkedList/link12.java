//Code for zig-zag linked list
public class link12 {
  public static class Node{
    int data;
    Node next;
    public  Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  public static Node tail;
  public void addFirst(int data){
    Node newNode = new Node(data);
    if(head==null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;

  }
  public void printLL(){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  public void zigzag(){
    //find mid
    Node slow = head;
    Node fast = head.next;
    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;
    //reverse the 2nd half
    Node current = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while(current!=null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    Node leftHalf = head;
    Node rightHalf = prev;
    Node nextL, nextR;

    //alternate merging
    while(leftHalf!=null && rightHalf!=null){
      nextL = leftHalf.next;
      leftHalf.next = rightHalf;
      nextR = rightHalf.next;
      rightHalf.next = nextL;

      leftHalf = nextL;
      rightHalf = nextR;
    }
  }
  public static void main(String args[]){
    link12 ll = new link12();
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.printLL();
    ll.zigzag();
    ll.printLL();
    }
}
