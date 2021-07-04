import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int[] arr=sol(n);
        System.out.println(arr[1]);
    }
    public static int[] sol(int n){
        if(n==1)
            return new int[]{1,0};
        else{
            int[] k = sol(n/2);
            if(n%2==1){
                if(k[0]+1>k[1])
                    return new int[]{k[0]+1,k[0]+1} ;
                else
                    return new int[]{k[0]+1,k[1]} ;
            }
            else
                return new int[]{0,k[1]};
        }
    }
}

