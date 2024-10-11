class Stack{
    int arr[];
    int top;
    Stack(int size){
        arr=new int[size];
        top=-1;
    }


    void push(int data){
        if(top==arr.length-1){
            System.out.println("Stack is full");
        }
        else {
            top++;
            arr[top]=data;
            
            System.out.println("Data has been inserted..");
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is empty can't delete the data ");
            return -1;
        }
        else{
            int value=arr[top];
            top--;
            System.out.println("Data has been poped "+value);
            return value;
        }
    }

    int top(){
        if(top==-1){
            System.out.println("Stack is null");
            return -1;
        }else {
            System.out.println("Top on list "+arr[top]);
            return arr[top];
        }
    }

    int size(){
        System.out.println("Total elements are "+(top+1));
        return top;
    }

    public static void main(String[] args) {
        Stack sc=new Stack(3);
        sc.push(3);
        sc.push(1);
        sc.push(8);
        sc.push(5);
        sc.pop();
        sc.push(4);

        sc.size();
        sc.top();
    }
}