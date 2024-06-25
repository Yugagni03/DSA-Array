import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[][]={{6,9,3},{2,1,0},{12,3,4},{3,7,8,}};
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
       
        //taking user input
        System.out.println("Enter rows:");
        int r= sc.nextInt();
        System.out.println("Enter col:");
        int c= sc.nextInt();
        int [][]arr2= new int[r][c];
        for(int i=0;i<r;i++){    //taking input
            for(int j=0;j<c;j++){
                arr2[i][j]= sc.nextInt();
            }
        }
// printing output
        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(arr2[i][j]);
            }
        }




    }
}
