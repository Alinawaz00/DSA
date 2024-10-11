class PrintNumbers{

    void printAscending(int currunt,int n){
        if(currunt>n){
            return ;
        }else{
            System.out.println(currunt+" ");
            printAscending(currunt+1, n);
           
        }
    }

    void printDiscending(int currunt){
        if(currunt<1){
            return;
        }else{
            System.out.println(currunt+" ");
            printDiscending(currunt-1);
        }
    }

    public static void main(String[] args) {
        PrintNumbers p=new PrintNumbers();

        p.printAscending(1, 5);
        p.printDiscending(5);
    }
}