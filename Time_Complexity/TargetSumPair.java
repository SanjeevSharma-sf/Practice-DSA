import java.util.*;
class TargetSumPair{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        targetSumPair(arr, tar);
    }
    public static void targetSumPair(int[] arr, int tar){
        //TC O(nlogn +n)
        Arrays.sort(arr);
        //meet in the middle
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]> tar){
                right--;
            }else if(arr[left]+ arr[right]<tar){
                left++;
            }
            else{
                System.out.println(arr[left] + "-"+ arr[right]);
                right--;
                left++;
            }
        }
    }
}