class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    int size=0;

    void addStart(int data){     // Add From start
        Node n=new Node(data);
        size++;
        if(head==null){
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }

    void addLast(int data){       // Add from last 
        Node n=new Node(data);
        size++;

        if(head==null){
            head=n;
        }
        else {
            Node temp=head;

            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }


    void search(int element){
        if(head==null){
            System.out.println("Linked List is empty");
        }

        Node temp=head;
        while(temp.next!=null){
            if(element==temp.data){
                System.out.println("Data has been founded  "+temp.data);
                return;
            }
            else {
                temp=temp.next;
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        ll.addStart(3);
        ll.addStart(2);
        ll.addStart(10);
        ll.addLast(4);

        ll.search(3);
        ll.search(1);
        System.out.println("Total size of linked list is  "+ll.size);
    }


}