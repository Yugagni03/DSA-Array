public class RepeatingEle {

    public static int fRepeatVal(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                   return arr[i];
                }
            }
        } return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,3,4,6};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]); // gives all repeted values
                    break;
                }
            }
        } 

        System.out.println(fRepeatVal(arr));
    
    }
}
