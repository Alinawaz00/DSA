import java.util.*;
class Task3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rows;
        int colm;
        System.out.println("Enter the rows ");
        rows=sc.nextInt();
        System.out.println("Enter the columns ");
        colm=sc.nextInt();

        int arr[][]=new int[rows][colm];

        System.out.println("Enter the values of Arrays..");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Boundires");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                if(i==0 || j==0 || i==(rows-1)|| j==(colm-1)){
                    System.out.println(arr[i][j]);
                }
            }
        }

        System.out.println("Centre Part");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                if(i==0 || j==0 || i==(rows-1)|| j==(colm-1)){
                    
                }
                else{
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}