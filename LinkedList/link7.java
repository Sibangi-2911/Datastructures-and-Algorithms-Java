//check if a LL is palindrome or not?
public class link7 {
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
  //slow-fast technique for finding mid
  public Node findMid(Node head){
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; //this is the midNode
  }
  //palindrome check
  public boolean Ispalindrome(){
    if(head==null || head==null){
      return true;
    }
    //step1-find mid
    Node midNode = findMid(head);
    //step2-reverse the 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr!=null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node right = prev;
    Node left = head;

    //step3-check left half and right half
    while(right!=null){
      if(left.data != right.data){
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }
  public static void main(String args[]){
    link7 ll = new link7();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.print();
    System.out.println(ll.Ispalindrome());
  }
}
