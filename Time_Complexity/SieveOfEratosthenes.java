import java.util.*;
class SieveOfEratosthenes{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //oldMethod(n);
        sieveOfEratosthenes(n);
    }
    public static void sieveOfEratosthenes(int n){
        boolean[] arr = new boolean[n+1];
        for(int i =2;i*i<arr.length;i++){
            if(arr[i] == false){
                for(int ja = i;i*ja < arr.length;ja++){
                    arr[i*ja]= true;
                }
            }
        }
        for(int i = 2;i<arr.length;i++){
            if(arr[i]== false){
                System.out.print(i+ " ");
            }
        }
    }
    public static void oldMethod(int n){
        //TC n*squareroot(n)
        for(int i = 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }

        }
    }
    public static boolean isPrime(int num){
        boolean flag = true;
        for(int div = 2;div*div<=num;div++){
            if(num%div == 0){
                flag = false;
                break;
            }
        }
    }
    
    
}