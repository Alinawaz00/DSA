class Quee{
    int size=5;
    int arr[]=new int[size];
    int front=0;
    int rear=0;

    void enquee(int data){
        if(rear==size){
            System.out.println("Quee is full ");
        }
        else{
            arr[rear]=data;
            rear++;
            System.out.println("Inserted..");
        }
    }

    void dequee(){
        if(rear==0){
            System.out.println("Stack is empty..");
        }else{
            System.out.println("Removed "+arr[front]);
            front++;
        }
    }

    void display(){
        for(int i=front;i<rear;i++){
            System.out.println(arr[i]);
        }
    }
    
    
}

class Main{
    public static void main(String[] args) {
        Quee q=new Quee();

        q.enquee(3);
        q.enquee(4);
        q.enquee(9);
        q.dequee();
        q.display();
    }
}