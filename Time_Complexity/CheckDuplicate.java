import java.util.*;
class CheckDuplicate{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int res = checkDuplicate(arr);
        System.out.println(res);
    }
    public static int checkDuplicate(int[] arr){
        Array.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
            else{
                return -1;
            }
        }
    }
}