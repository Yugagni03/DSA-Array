public class TripletNum {
    public static void main(String[] args) {
        int ans=0;
        int arr[]= {1,6,5,2,7,8};
        int n=arr.length;
        int target =12;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
