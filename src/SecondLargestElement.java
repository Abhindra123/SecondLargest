import java.util.Scanner;

public class SecondLargestElement {
    public static int SecondLarge(int arr[],int max){

        int secondMax=0;
        if(arr.length>1) {
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]>arr[j]){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }}
     }

            for(int k=arr.length-1;k>=0;k--){
                if(arr[k]!=max){
                    secondMax=arr[k];
                    break;
                }
            }
        }
        else{
            secondMax=-1;
        }
        return secondMax;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int p=0;p<arr.length;p++){
            if(max<arr[p]){
                max=arr[p];
            }
        }
        int val=SecondLarge(arr,max);
        System.out.println("The second max element is : "+val);
    }
}