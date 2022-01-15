import java.util.*;
class InsertionSort{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i< arr.length;i++){
            arr[i]= scn.nextInt();
        }
        insertionSort(arr);
        print(arr);
    }
    public static void insertionSort(int[] arr){
        for(int i =1;i<arr.length;i++){
            for(int j= i-1;j>=0;j--){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }else{
                    break;
                }
            }
        }
    }
    public static void swap(int[] arr , int idx1 , int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void print(int[] arr){
        for(int val: arr){
            System.out.println(val);
        }
    }
}