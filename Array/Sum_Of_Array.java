public class Sum_Of_Array{
    public static void main(String[] args){
        int arr[]=new int[3];
        arr[0]= 1;
        arr[1]= 5;
        arr[2]= 3;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);

    }
}