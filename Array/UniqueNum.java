public class UniqueNum {
    public static void main(String[] args) {
        int arr[]={1,7,4,7,1,2,2};
        int n=arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        } 
         for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans=arr[i];
                System.out.println(ans);
            }
        }
    }
}
