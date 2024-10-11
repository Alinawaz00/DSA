class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class QueeUsingLinkedList{
    Node head;

    void enQuee(int data){

        Node n=new Node(data);
        if(head==null){
            head=n;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            System.out.println("Node has been added ");
        }
    }

    void deQuee(){
        if(head==null){
            System.out.println("Quee is emptty");
        }
        else{
            System.out.println("Node has been deleted.."+head.data);
            head=head.next;
           
        }
    }

    void print(){
        if(head==null){
            System.out.println("Quee is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;

            }
            System.out.println(temp.data);
        }
    }

    
}
class Main{
    public static void main(String[] args) {
        QueeUsingLinkedList q=new QueeUsingLinkedList();

        q.enQuee(3);
        q.enQuee(5);
        q.enQuee(7);
        q.deQuee();
        q.print();
    }
    
}


