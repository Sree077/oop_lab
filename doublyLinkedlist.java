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
        if(head==null){
            head = newNode;
            tail = newNode; 
        }
        else{
            tail.next= newNode;
            newNode.prev = tail;
            tail= newNode;
        }
    }
    public void delete(int data){
        Node cur = head;
        while(cur != null){
            if(cur.data==data){
                if(cur==head && cur == tail){
                    head = null;
                    tail = null;
                } 
                else if(cur == head){
                    
                }
            }
        }
    }
}




public class doublyLinkedlist {
    
}
