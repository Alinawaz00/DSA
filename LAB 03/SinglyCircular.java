class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Singly{
    Node head,tail;


    void addStart(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n; 
            
            tail.next=head;
        }
        else{
            n.next=head;
            head=n;
            tail.next=head;

        }
    }

    void addLast(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
            tail.next=head;
        }
        else{
            
            tail.next=n;
            n.next=head;
            tail=n;
            
        }
    }

}