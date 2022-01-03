import java.io.*;
import java.util.*;
class SelectionSort {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i< arr.length;i++){
            arr[i] = scn.nextInt();
        }
        selectionSort(arr);
        print(arr);
    }
    public static void selectionSort(int [] arr){
        //iteration i 0 to n-1
        //minidx starting mein i hi hoga 
        //j chalega i+1 se leke arr.length tak
        //comparision hoga minidx or j ke beech and update the minidx if finds smaller element
        //last mein swap kar dena he i and minidx ko
        for(int i = 0;i<arr.length;i++){
            int minidx = i;
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[j] < arr[minidx]){
                    minidx = j;
                }
                swap(arr,i,minidx);
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