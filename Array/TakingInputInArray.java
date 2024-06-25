import java.util.Scanner;

public class TakingInputInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter values: ");
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

}
