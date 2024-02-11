class Node{
    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class linkedlist{
    Node head;
    Node tail;
    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev= tail;
            tail = newNode;
        }
    }
    public void delete(int data){
        Node cur = head;
        while(cur != null){
            if (cur.data==data){
                if (cur == head && cur == tail){
                    head=null;
                    tail=null;
                }
                else if(cur == head){
                    head=head.next;
                    head.prev=null;
                }
                else if(cur == tail){
                    tail = tail.prev;
                    tail.next=null;
                }
                else{
                    cur.prev.next=cur.next;
                    cur.next.prev=cur.prev;
                }
            break;
            }
        cur=cur.next;
        }
    }
    public void display(){
        Node cur = head;
        if (head == null){
            System.out.println("List is empty.");
        }
        else{
            System.out.print("Elements in list are: ");
            while(cur != null){
                System.out.print(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        }
    }
}
public class doublyLinkedlist {
    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insert(5);
        l.insert(10);
        l.insert(15);
        l.insert(25);
        l.insert(35);
        l.insert(45);
        l.display();
        l.delete(45);
        System.out.println("list after deletion of 10: ");
        l.display();
    }
}
