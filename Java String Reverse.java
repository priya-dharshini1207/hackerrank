
import java.io.*; 
import java.util.*;

public class Solution {

public static void main(String[] args) {
   //Two Pointer Solution 
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    int lowpt = 0;
    int highpt = A.length()-1;
    boolean flag = true;
    while(lowpt<highpt){
        if(A.charAt(lowpt)!=A.charAt(highpt)){
            flag = false;
                            break;
                            }
        highpt--;
        lowpt++;
    }
    System.out.println((flag)?"Yes":"No");
}

}
