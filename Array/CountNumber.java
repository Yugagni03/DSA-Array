import java.util.Scanner;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        System.out.println("Enter the value of X :");
        int x= sc.nextInt();
        int arr[]= {4,9,2,3,4,4,1,2};
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
}
