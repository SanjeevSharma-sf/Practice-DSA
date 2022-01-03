import java.util.*;
class MergeTwoSortedArray{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];

        for(int i = 0;i< a.length;i++){
            a[i]= scn.nextInt();
        }
        for(int i = ;i<b.length;i++){
            b[i] = scn.nextInt();
        }
        int[] mergeArray = mergeTwoSortedArray(a,b);
        
        print(mergeArray);
    }
    public static int [] mergeTwoSortedArray(int[] a, int[] b){
        int[] res = new int [a.length+b.length];
        int i = 0;
        int j= 0;
        int k=0;
        while(i<a.length && b.length){
            if(a[i]<b[j]){
                res[k] = a[i];
                i++;
                k++;
            }
            else{
                res[k] = b[j];
                j++;
                k++;
            }

        }
        if(i == a.length){
            while(j<b.length){
                res[k] = b[j];
                j++;
                k++;
            }
        }
        else if(j == b.length){
            while(i<a.length){
                res[k] = a[i];
                i++;
                k++;
            }
        }
        return res;
    }
    
    public static void print(int[] arr){
        for(int val: arr){
            System.out.println(val);
        }
    }
}