import java.io.*;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        if(n<0){
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
        }
        ArrayList<String> nm1 = getStairPaths(n-1);
        ArrayList<String> nm2 = getStairPaths(n-2);
        ArrayList<String> nm3 = getStairPaths(n-3);

        ArrayList<String> paths = new ArrayList<String>();
        for(String path: nm1){
            paths.add("1"+path);
        }
        for(String path: nm2){
            paths.add("2"+path);
        }
        for(String path: nm3){
            paths.add("3"+path);
        }
        return paths;
        
    }
        

}