import java.io.*;
import java.util.*;
class BubbleSort {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i< arr.length;i++){
            arr[i] = scn.nextInt();
        }
        bubbleSort(arr);
        print(arr);
    }
    public static void bubbleSort(int [] arr){
        //us index ke element ko uske pahle wale element se compare karenge
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int[] arr,int  idx1,int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}