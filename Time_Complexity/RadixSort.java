import java.io.*;
import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    // write code here   
    //find the max of the array to find the max place value number 
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    int place = 1;
    while(max/place>0){
      countSort(arr,place);
      place = place*10;
    }

  }
  public static void countSort(int[] arr, int exp) {
    // write code here
    //find the range for the frequency array
    int range = 10;
    int[] freqArray = new int[range];
    fillFreqArray(arr,freqArray,exp);
    int[] prefixArray = updatetoprefixArray(freqArray);
    //Now fill the ans array
    int[] ans = fillAnsArray(prefixArray,arr,exp);
    updateTheOriginalArray(ans,arr);

    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }
  public static int[] fillAnsArray(int[] prefixArray,int[] arr,int exp){
    int[] ans = new int[arr.length];
    for(int i = arr.length - 1; i >= 0; i--){
          int val = arr[i] / exp % 10;
          int pos = prefixArray[val];
          ans[pos - 1] = arr[i];
          prefixArray[val]--;
      }
      return ans;
  }
  public static void updateTheOriginalArray(int[] ans, int[] arr){
    for(int i = 0; i < ans.length; i++){
          arr[i] = ans[i];
      }
  }

  public static int[] updatetoprefixArray(int[] freqArray){
    for(int i = 1;i<freqArray.length;i++){
      freqArray[i]+=freqArray[i-1];
    }
    return freqArray;
  }
  public static void fillFreqArray(int[] arr,int[] freqArray,int exp){
    for(int i = 0;i<arr.length;i++){
      int val = arr[i]/exp%10;
      freqArray[val]++;
    }
  }

  public static void findMinMax(int[] arr,int min,int max){
    for(int i = 0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }
      if(arr[i]<min){
        min = arr[i];
      }
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}