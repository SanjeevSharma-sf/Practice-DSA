import java.util.*;
class TargetSumTriplet{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        targetSumTriplet(arr, tar);
    }
    public static targetSumTriplet(int[] arr, int target){
        //first task is to sort the array
        //TC O(nlogn + n^2)=> O(n^2)
        //SC O(1)
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            int ntar = target-arr[i];
            int left= i+1;
            int right = arr.length-1;
            while(left<right){
                if(arr[left]+arr[right]> ntar){
                    right--;
                }
                else if(arr[left]+arr[right]<ntar){
                    left++;
                }
                else{
                    System.out.println(arr[i]+"-"+arr[left]+" "+arr[right]);
                    left++;
                    right--;
                }
            }
        }

    }
}