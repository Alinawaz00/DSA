class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class StackUsingLinkedList{
    Node head;

    void push(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }else {
            n.next=head;
            head=n;
        }
    }

    void pop(){
        
        if(head==null){
            System.out.println("Stack is empty ");
        }
        else {
            head=head.next;
        }
    }
}