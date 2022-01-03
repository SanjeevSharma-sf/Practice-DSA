import java.util.*;
class HighFreqCharacter{
    public static void main (System.in){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char ch = highFreqCharacter(str);
        System.out.println(ch);
    }
    public static char highFreqCharacter(String str){
        int[] freqArr = new int[26];
        for(int i = 0;i< str.length();i++){
            char chr = str.charAt(i);

            int indexForchr = ch-65; //this will give the result in the integer
            freqArr[indexForchr]++;
        }
        int maxidx = Integer.MIN_VALUE;
        for(int i = 1;i<freqArr.length;i++){
            if(freqArr[i]>freqArr[maxidx]){
                maxidx = i;
            }
        }
        char hfch =  (char)(maxidx+65); //this will give the result in int so we have to typecast it into char   
        return hfch;
    }
}