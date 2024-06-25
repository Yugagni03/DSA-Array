import java.util.Scanner;

public class PairNum {
    static int pair(int arr[], int target){
        int ans=0;
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1;
            j<n; j++){
               if(arr[i]+arr[j] == target){
                ans++;
               }
            } 
        }
        return ans;

    }
    public static void main(String[] args){
    int arr[]={4,6,3,5,8,2};
    int target=7;

    System.out.println(pair(arr, target));
}
}
