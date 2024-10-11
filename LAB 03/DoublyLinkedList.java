class Node {
    int data;
    Node next,prew;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prew=null;
    }

}


class Doubly{
    Node head;

    void addStart(int data){
        Node n=new Node(data);
        if (head==null) {
            head=n;
        }
        else{
            n.next=head;
            head.prew=n;
            head=n;
        }
    }

    void addLast(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.prew=temp;
            
        }
    }
}