class Node{
    int data;
    Node next;
    Node prew;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prew=null;
    }
}

class Circular{
    Node head;
    Node tail;

    void addStart(int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
            tail.next=head;
            head.prew=tail;
        }
        else{
            n.next=head;
            head.prew=n;
            n.prew=tail;
            head=n;
            tail.next=head;
            
        }
    }
}