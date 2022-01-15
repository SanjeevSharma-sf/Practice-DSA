import java.io.*;
import java.util.*;

public class CountSort {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   //find the min and max in the array
   //this min and max is already given here
//    int min = Integer.MAX_VALUE;
//    int max = Integer.MIN_VALUE;
//    findMinMax(arr,min,max);
   int range = max-min+1;
   //fill the frequency array
   int[] freqArray = new int[range];
   fillFreqArray(arr,min,freqArray);
   //Now update the frequency array to prefix sum array
   int[] prefixArray = preficSumArray(freqArray);
   //Now we will make a ans array of length arr.length
   int[] ans = new int[arr.length];
   fillAnsArray(arr,prefixArray,min);
   fillOriginalArray(arr,ans);
   //print(arr);
   
  }
  
  public static void findMinMax(int[] arr,int min , int max){
      for(int i = 0;i<arr.length;i++){
          if(arr[i]>max){
              max = arr[i];
          }
          if(arr[i]<min){
              min = arr[i];
          }
      }
  }
  public static int[] prefixSumArray(int[] freqArray){
      for(int i = 1;i<freqArray.length;i++){
          freqArray[i] = freqArray[i-1]+freqArray[i];
      }
      return freqArray;
  }
  public static void fillFreqArray(int[] arr, int min, int[] freqArray){
      for(int i = 0;i<arr.length;i++){
          int temp = arr[i]-min;
          freqArray[temp]++;
      }
  }
  public static void fillAnsArray(int[] arr, int[] prefixArray, int min){
      //to keep the sorting stable we have to run the loop backwards
      for(int i = arr.length-1;i>=0;i--){

          int temp = arr[i]-min;
          int posidx = prefixArray[temp];
          ans[posidx-1]= arr[i];
          prefixArray[temp]--;
      }
  }
  public static void fillOriginalArray(int[] arr, int[] ans){
      for(int i = 0;i<arr.length;i++){
          arr[i]=ans[i];
      }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}