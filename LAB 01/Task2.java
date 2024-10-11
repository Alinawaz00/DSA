import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][5];

        System.out.println("Enter the values of Arrays ");
        int oneArray[]=new int[20];
        int count=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                oneArray[count]=arr[i][j];
                count++;
            }
        }

        System.out.println("After copying");
        for(int i=0;i<20;i++){
            System.out.println(oneArray[i]);
        }

    }
}
