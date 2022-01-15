import java.util.*;
class MergeSort{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int[] res = mergeSort(arr,0,arr.length-1);
        print(res);
    }
    public static int [] mergeSort(int[] arr, int low , int high){
        //TC O(nlogn)
        //SC O(n)
        if(low == high){
            //base condition
            int[] baseArray = int int[1];
            baseArray[0] = arr[low];
            return baseArray;
        int mid = (low +high)/2;
        int[] fsm = mergeSort(arr,low, mid);
        int[] rsm = mergeSort(arr, mid+1,high);
        int [] tm = mergeTwoSortedArray(fsm,rsm);
        return tm;
    }
    public static int [] mergeTwoSortedArray(int[] a, int[] b){
        int[] res = new int[a.length+b.length];
        int i = 0;
        int j= 0;
        int k= 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k]= a[i]
                k++;
                i++;
            }
            else{
                res[k] = b[j];
                k++;
                j++;
            }
        }
        if(i == a.length){
            while(j<b.length){
                res[k]= b[j];
                k++;
                j++;
            }
        }
        else if(j == b.length){
            while(i<a.length){
                res[k]= a[i];
                k++;
                i++;
            }
        }
        return res;
    }
}