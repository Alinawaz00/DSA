class SlectionSort{

    
    void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        SlectionSort s=new SlectionSort();
        int arr[]={5,4,3,2,1};
        s.selection(arr);

        System.out.println("After sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        
    }


}