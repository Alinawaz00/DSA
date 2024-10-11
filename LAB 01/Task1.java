class EvenOdd{
    public static void main(String[] args) {
        int arr[]={3,5,2,4,1,7,8,0};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                System.out.println(arr[i]);
            }
        }
    }
}