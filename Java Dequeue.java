import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        var max = 0;
        var s = new Scanner(System.in);
        var integerList = new ArrayDeque<>();
        var n = s.nextInt();
        var m = s.nextInt();
        var freqMap = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < n ; i++){
            var num = s.nextInt();
            integerList.addLast(num);
            freqMap.put(num,freqMap.getOrDefault(num, 0) + 1);
            // System.out.println("queue before : " + integerList + " HashMap : " + freqMap);
            //make sure the window size is maintained
            if(integerList.size()> m){
                var removed = (Integer) integerList.removeFirst();
                freqMap.put(removed, freqMap.getOrDefault(removed, 0) - 1);
                if(freqMap.get(removed) == 0){
                    freqMap.remove(removed);
                }
            }
            // System.out.println("queue After : " + integerList + " HashMap : " + freqMap);
            //check for max
            if(integerList.size() == m){
                max = Math.max(freqMap.size(),max);
            }
        }
        s.close();
        
        System.out.println(max);
    }
}
