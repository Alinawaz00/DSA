class PrintCharacters{

    void forward(char a[],int index){
        if(index>=a.length){
            return;
        }
        else{
            System.out.println(a[index]);
            forward(a, index+1);
        }
    }

    void reverse(int index,char a[]){
        if(index <0){
            return;
        }
        else{
            System.out.println(a[index]);
            reverse(index-1, a);
        }
    }

    public static void main(String[] args) {
        PrintCharacters p=new PrintCharacters();
        char arr[]={'a','b','c','d','e'};
        p.forward(arr, 0);
        p.reverse(arr.length-1, arr);
    }
}