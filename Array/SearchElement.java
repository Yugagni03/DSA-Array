public class SearchElement {
        public static void main(String[] args) {
            int arr[]={1,5,3,9};
            int key=3;
            int ans=-1;
            for(int i=0;i<arr.length;i++){
               if(arr[i]==key){
               ans=i;
               }
            }
            System.out.println(ans);
        }
    }

